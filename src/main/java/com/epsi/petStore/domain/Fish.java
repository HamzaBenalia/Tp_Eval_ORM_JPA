package com.epsi.petStore.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Fish extends Animal {

@Enumerated(EnumType.STRING)
private FishLivEnv livingEnv;

}
