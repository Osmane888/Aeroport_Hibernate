package org.example.entities.personnes;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(nullable = false, length = 10)
    private String number;

    @Column(nullable = false, length = 100)
    private String street;

    @Column(nullable = false)
    private Long cp;

    @Column(nullable = false,length = 60)
    private String city;

    @Column(nullable = false, length = 50)
    private String country;

    public Address(){};

    public Address(String number, String street, Long cp, String city, String country) {
        this();
        this.number = number;
        this.street = street;
        this.cp = cp;
        this.city = city;
        this.country = country;
    }

    //region GET/SET

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getCp() {
        return cp;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //endregion
}
