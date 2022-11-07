package io.kodlama.devs.controller;

import io.kodlama.devs.bussiness.abstracts.ProgrammingLanguageService;
import io.kodlama.devs.bussiness.request.language.CreateLanguageRequest;
import io.kodlama.devs.bussiness.request.language.DeleteLanguageRequest;
import io.kodlama.devs.bussiness.request.language.UpdateLanguageRequest;
import io.kodlama.devs.bussiness.responses.language.GetAllLanguageResponse;
import io.kodlama.devs.bussiness.responses.language.GetLanguageByIdResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private ProgrammingLanguageService languageService;
    public LanguageController(ProgrammingLanguageService languageService){
        this.languageService = languageService;
    }

    @PutMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest){
        this.languageService.add(createLanguageRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest){
        this.languageService.delete(deleteLanguageRequest);
    }
    @PutMapping("/update")
    public void update (int id, UpdateLanguageRequest updateLanguageRequest){
        this.languageService.update(id,updateLanguageRequest);
    }
    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll(){
        return this.languageService.getAll();
    }
    @GetMapping("/getById")
    public GetLanguageByIdResponse getById(int id){
        return this.languageService.getById(id);
    }
}
