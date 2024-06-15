package com.epsi.petStore.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a fish, which is a specific type of animal.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Fish extends Animal {

@Enumerated(EnumType.STRING)
@Column(name="livingEnv")
private FishLivEnv livingEnv;

}
