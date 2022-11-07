package io.kodlama.devs.bussiness.concretes;

import io.kodlama.devs.bussiness.abstracts.ProgrammingLanguageService;
import io.kodlama.devs.bussiness.request.language.CreateLanguageRequest;
import io.kodlama.devs.bussiness.request.language.DeleteLanguageRequest;
import io.kodlama.devs.bussiness.request.language.UpdateLanguageRequest;
import io.kodlama.devs.bussiness.responses.language.GetAllLanguageResponse;
import io.kodlama.devs.bussiness.responses.language.GetLanguageByIdResponse;
import io.kodlama.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import io.kodlama.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.setName(createLanguageRequest.getName());
        if(!isLanguageEmpty(language) && !isLanguageNameExist(language))
            this.programmingLanguageRepository.save(language);
        else
            System.err.println("Duplicate or blank data cannot be entered.");
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        int flag = 0;
        for(ProgrammingLanguage language : programmingLanguageRepository.findAll()){
            if(language.getId() == deleteLanguageRequest.getId()){
                programmingLanguageRepository.deleteById(deleteLanguageRequest.getId());
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.err.println("The id you tried to delete was not found in the database.");
    }

    @Override
    public void update(int languageId,UpdateLanguageRequest updateLanguageRequest) {
        if(isLanguageIdExist(languageId)){
            ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(languageId).get();
            if(!isLanguageEmpty(programmingLanguage)){
                programmingLanguage.setName(updateLanguageRequest.getName());
                programmingLanguageRepository.save(programmingLanguage);
            }
            else
                System.err.println("Duplicate or blank data cannot be entered.");
        }
        else
            System.err.println("The data you want to update could not be found in the database.");

    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List <ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        List <GetAllLanguageResponse> languageResponses = new ArrayList<>();
        for(ProgrammingLanguage language: languages){
            GetAllLanguageResponse response = new GetAllLanguageResponse();
            response.setId(language.getId());
            response.setName(language.getName());
            languageResponses.add(response);
        }
        return  languageResponses;
    }

    @Override
    public GetLanguageByIdResponse getById(int languageId) {
        GetLanguageByIdResponse response = new GetLanguageByIdResponse();
            if(isLanguageIdExist(languageId)){
                response.setName(programmingLanguageRepository.getReferenceById(languageId).getName());
                response.setId(programmingLanguageRepository.getReferenceById(languageId).getId());
                return response;
            }
            else
                System.err.println("The data you want to see could not be found in the database.");
            return null;
    }

    private boolean isLanguageIdExist  (int id){
        for(int i = 0; i < programmingLanguageRepository.findAll().size(); i++)
            if(programmingLanguageRepository.findAll().get(i).getId() == id)
                return true;
        return false;
    }
    private boolean isLanguageNameExist (ProgrammingLanguage programmingLanguage){
        for(ProgrammingLanguage language : programmingLanguageRepository.findAll()){
            if(language.getName().equalsIgnoreCase(programmingLanguage.getName()))
                return true;
        }
        return false;
    }
    private  boolean isLanguageEmpty(ProgrammingLanguage programmingLanguage){
        return programmingLanguage.getName().isEmpty() || programmingLanguage.getName().isBlank();
    }
}
