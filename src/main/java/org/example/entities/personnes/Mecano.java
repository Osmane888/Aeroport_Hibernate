package org.example.entities.personnes;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import org.example.entities.machines.Avion;

@Entity
public class Mecano extends Personne{

    @ManyToMany
    @JoinTable(
            name = "Maintenance",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "immatriculation"))
    private Avion avion;
}
