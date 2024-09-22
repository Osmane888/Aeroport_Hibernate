package org.example.entities.machines;

import jakarta.persistence.*;

@Entity
public class TypeAvion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String constructeur;

    @Column(nullable = false)
    private Long puissance;

    @Column(nullable = false)
    private Integer nbPlaces;
}
