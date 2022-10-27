package io.kodlama.devs.controller;

import io.kodlama.devs.bussiness.abstracts.LanguageService;
import io.kodlama.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    public LanguagesController (LanguageService languageService){
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/get/{id}")
    public ProgrammingLanguage getProgrammingLanguage(@PathVariable int id){
        return languageService.getProgrammingLanguage(id);
    }

    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
       languageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") int programmingLanguageId) throws Exception {
        languageService.delete(programmingLanguageId);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, @RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        languageService.update(id,programmingLanguage);
    }

}
