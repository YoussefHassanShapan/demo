package com.example.demo.models;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();
    public Owner() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public Owner(String firstName, String lastName, Set<Pet> pets, String telephone, String city, String address) {
        super(firstName, lastName);
        this.pets = pets;
        this.telephone = telephone;
        this.city = city;
        this.address = address;
    }

    public Owner(Set<Pet> pets, String telephone, String city, String address) {
        this.pets = pets;
        this.telephone = telephone;
        this.city = city;
        this.address = address;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}