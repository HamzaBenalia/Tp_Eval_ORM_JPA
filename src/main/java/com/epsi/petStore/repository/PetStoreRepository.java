package com.epsi.petStore.repository;

import com.epsi.petStore.domain.Animal;
import com.epsi.petStore.domain.PetStore;
import com.epsi.petStore.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;


/**
 * Repository interface for {@link PetStore} instances. Provides basic CRUD operations
 * and additional methods to retrieve entities using the pagination and sorting abstraction
 * due to the extension of {@link JpaRepository}.
 * The implementation of this interface is automatically created by Spring Data JPA.
 */
@Repository
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {


    PetStore findByName(String feedYourPet);

    @Query("SELECT p.animals FROM PetStore p WHERE p.name = :name")
    Set<Animal> findAnimalsByPetStoreName(@Param("name") String name);

}


