package com.epsi.petStore.repository;
import com.epsi.petStore.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Product} instances. Provides basic CRUD operations
 * due to the extension of {@link CrudRepository}.
 * The implementation of this interface is automatically created by Spring Data JPA.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


}
