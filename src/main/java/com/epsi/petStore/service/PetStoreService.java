package com.epsi.petStore.service;


import com.epsi.petStore.domain.PetStore;
import com.epsi.petStore.repository.PetStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetStoreService {

    private PetStoreRepository petStoreRepository;

    @Autowired
    public PetStoreService(PetStoreRepository petStoreRepository) {
        this.petStoreRepository = petStoreRepository;
    }



    public List<PetStore> getAllPetStores() {
        return petStoreRepository.findAll();
    }

    public Optional<PetStore> getPetStoreById(Long id) {
        return petStoreRepository.findById(id);
    }

    public PetStore savePetStore(PetStore petstore) {
        return petStoreRepository.save(petstore);
    }

    public void deletePetStore(Long id) {
        petStoreRepository.deleteById(id);
    }

}
