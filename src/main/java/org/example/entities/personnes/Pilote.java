package org.example.entities.personnes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Pilote extends Personne{

    @Column(nullable = false, length = 50)
    private String numBrevet;
}
