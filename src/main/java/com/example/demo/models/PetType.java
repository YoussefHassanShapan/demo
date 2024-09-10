package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public PetType(String name) {
        this.name = name;
    }

    public PetType() {

    }
}
