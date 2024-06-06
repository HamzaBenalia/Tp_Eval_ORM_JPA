package com.epsi.petStore.repository;

import com.epsi.petStore.domain.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
}
