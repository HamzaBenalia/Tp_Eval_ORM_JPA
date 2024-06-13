package com.epsi.petStore.domain;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Represents a cat, which is a specific type of animal.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cat extends Animal {

    private String chipId;
}
