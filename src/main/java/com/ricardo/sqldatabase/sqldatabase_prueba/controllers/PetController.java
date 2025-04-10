package com.ricardo.sqldatabase.sqldatabase_prueba.controllers;


import com.ricardo.sqldatabase.sqldatabase_prueba.entities.Pet;
import com.ricardo.sqldatabase.sqldatabase_prueba.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }
}
