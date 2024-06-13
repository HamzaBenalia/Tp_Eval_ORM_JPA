package com.epsi.petStore.repository;
import com.epsi.petStore.domain.Animal;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository interface for {@link Animal} instances. Provides basic CRUD operations
 * due to the extension of {@link CrudRepository}.
 * The implementation of this interface is automatically created by Spring Data JPA.
 * This repository is transactional.
 */
@Repository
@Transactional
public interface AnimalRepository extends CrudRepository<Animal, Long> {



}
