package com.epsi.petStore.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * Represents a product sold in a pet store.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String label;

    @Enumerated(EnumType.STRING)
    private ProdType type;

    private Double price;


    /**
     * The pet stores that sell this product.
     * This relationship is many-to-many, as a product can be sold in multiple pet stores and a pet store can sell multiple products.
     */

    @ManyToMany(mappedBy = "products")
    private List<PetStore> petStores = new ArrayList<>();

}
