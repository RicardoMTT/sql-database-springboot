package com.ricardo.sqldatabase.sqldatabase_prueba.repositories;

import com.ricardo.sqldatabase.sqldatabase_prueba.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
