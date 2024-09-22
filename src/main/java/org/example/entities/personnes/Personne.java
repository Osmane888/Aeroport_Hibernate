package org.example.entities.personnes;

import jakarta.persistence.*;

@Entity
@Table(
        uniqueConstraints = {@UniqueConstraint(
                name="uk_firstname__lastname",
                columnNames = {"firstname","lastname"}
                )}
        )
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String nom;

    @Column(nullable = false, length = 120)
    private String prenom;

    @Column(nullable = false)
    private String tel;

    @Embedded
    private Address address;

    public Personne(){};

    public Personne(String nom, String prenom, String tel, Address address) {
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.address = address;
    }

    //region GET/SET
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //endregion


    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", address=" + address +
                '}';
    }
}
