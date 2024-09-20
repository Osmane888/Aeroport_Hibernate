package org.example.entities.machines;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Avion {

    @Id
    private String immatriculation;

    @Column
    private Long nb_vols;
}
