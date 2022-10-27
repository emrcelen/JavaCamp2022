package io.kodlama.devs.bussiness.abstracts;

import io.kodlama.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getProgrammingLanguage(int programmingLanguageId);
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(int programmingLanguageId) throws Exception;
    void update(int id,ProgrammingLanguage programmingLanguage) throws Exception;
}
