package com.epsi.petStore.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Animal {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime birth;

    private String Color;


}
