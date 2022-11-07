package io.kodlama.devs.dataAccess.abstracts;

import io.kodlama.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository  extends JpaRepository<ProgrammingLanguage,Integer> {
}
