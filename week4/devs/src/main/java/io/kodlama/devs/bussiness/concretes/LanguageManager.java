package io.kodlama.devs.bussiness.concretes;

import io.kodlama.devs.bussiness.abstracts.LanguageService;
import io.kodlama.devs.dataAccess.abstracts.LanguageRepository;
import io.kodlama.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    public List<ProgrammingLanguage> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage(int programmingLanguageId) {
        if(isIdExist(programmingLanguageId))
            return languageRepository.getProgrammingLanguage(getById(programmingLanguageId));
        else
            return null;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        int flag = 0;
        if(controlDuplicate(programmingLanguage.getId(), programmingLanguage.getName()))
            languageRepository.add(programmingLanguage);
        else
            throw new Exception("Duplicate data cannot be entered.");

    }

    @Override
    public void delete(int programmingLanguageId) throws Exception {
        if(isIdExist(programmingLanguageId))
            languageRepository.delete(getById(programmingLanguageId));
        else
            throw new Exception("The id you tried to delete was not found in the registry.");
    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) throws Exception {
        if(isIdExist(id) && controlDuplicate(programmingLanguage.getId(),programmingLanguage.getName()))
            languageRepository.update(getById(id),programmingLanguage);
        else
            throw new Exception("No registry was found for the information you specified.");
    }

    private int getById(int programmingLanguageId){
        int index = 0;
        for (ProgrammingLanguage programmingLanguage : getAll()) {
            if(programmingLanguage.getId() == programmingLanguageId)
                break;
            index++;
        }
        return index+1;
    }
    private boolean isIdExist(int programmingLanguageId){
        for(ProgrammingLanguage programmingLanguage : getAll())
            if(programmingLanguage.getId() == programmingLanguageId)
                return true;
        return false;
    }
    private boolean controlDuplicate(int programmingLanguageId, String programmingName){
        for(ProgrammingLanguage programmingLanguage : getAll()){
            if (programmingLanguage.getId() == programmingLanguageId || programmingLanguage.getName().equalsIgnoreCase(programmingName)) {
                return false;
            }
        }
        return true;
    }


}
