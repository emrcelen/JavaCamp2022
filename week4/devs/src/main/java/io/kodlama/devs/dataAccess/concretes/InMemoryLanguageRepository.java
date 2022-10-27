package io.kodlama.devs.dataAccess.concretes;

import io.kodlama.devs.dataAccess.abstracts.LanguageRepository;
import io.kodlama.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    private List<ProgrammingLanguage> programmingLanguages;

    public InMemoryLanguageRepository() {
        this.programmingLanguages = new ArrayList<>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
    }


    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage(int programmingLanguageId) {
        return programmingLanguages.get(getById(programmingLanguageId));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage){
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int programmingLanguageId) {
        programmingLanguages.remove(getById(programmingLanguageId));
    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage){
        programmingLanguages.set(getById(id),programmingLanguage);
    }

    private int getById(int programmingLanguageId){
        int index = 0;
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if(programmingLanguage.getId() == programmingLanguageId)
                break;
            index++;
        }
        return index;
    }
}
