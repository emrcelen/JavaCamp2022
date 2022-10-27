package io.kodlama.devs.dataAccess.abstracts;

import io.kodlama.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getProgrammingLanguage(int programmingLanguageId);
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int programmingLanguageId);
    void update(int id,ProgrammingLanguage programmingLanguage);
}
