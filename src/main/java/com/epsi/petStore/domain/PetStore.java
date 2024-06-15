package com.epsi.petStore.domain;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents a pet store that sells products and houses animals.
 */

@NoArgsConstructor
@Data
@Entity
@Table(name = "petstore", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name", "managerName"})
})
public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="managerName")
    private String managerName;

    /**
     * The products sold in this pet store.
     * This relationship is many-to-many, as a product can be sold in multiple pet stores.
     */
    @ManyToMany
    @JoinTable(
            name = "petstore_product",
            joinColumns = @JoinColumn(name = "petstore_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

    /**
     * The address of this pet store.
     * This relationship is one-to-one, as each pet store has one address.
     */

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Address_id")
    private Address address;


    /**
     * The animals housed in this pet store.
     * This relationship is one-to-many, as a pet store can house multiple animals.
     */
    @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL)
    private Set<Animal> animals = new HashSet<>();


    public PetStore(String name, String managerName, List<Product> products, Address address, Set<Animal> animals) {
        this.name = name;
        this.managerName = managerName;
        this.products = products;
        this.address = address;
        this.animals = animals;
    }
}
