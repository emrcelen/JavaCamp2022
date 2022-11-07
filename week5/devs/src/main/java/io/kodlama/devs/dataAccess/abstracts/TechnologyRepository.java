package io.kodlama.devs.dataAccess.abstracts;

import io.kodlama.devs.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
