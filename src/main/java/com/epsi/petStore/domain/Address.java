package com.epsi.petStore.domain;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an address associated with a pet store.
 */
@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"number", "street", "zipCode", "city"})
})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private String number;
    @Column(name = "street")
    private String street;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "city")
    private String city;

    /**
     * The pet store associated with this address.
     * This relationship is bidirectional and the owning side is {@link PetStore}.
     */

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address" )
    private PetStore petStore;

    public Address(String number, String street, String zipCode, String city, PetStore petStore) {
        this.number = number;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.petStore = petStore;
    }
}
