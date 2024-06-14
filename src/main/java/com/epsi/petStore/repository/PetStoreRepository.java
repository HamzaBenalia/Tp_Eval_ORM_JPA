package com.epsi.petStore.repository;
import com.epsi.petStore.domain.Animal;
import com.epsi.petStore.domain.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Set;

/**
 * Repository interface for {@link PetStore} instances. Provides basic CRUD operations
 * and additional methods to retrieve entities using the pagination and sorting abstraction
 * due to the extension of {@link JpaRepository}.
 * The implementation of this interface is automatically created by Spring Data JPA.
 */
@RepositoryRestResource(path = "petStores")
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {


    PetStore findByName(@Param("name") String name);

    @Query("SELECT p.animals FROM PetStore p WHERE p.name = :name")
    Set<Animal> findAnimalsByPetStoreName(@Param("name") String name);

}


