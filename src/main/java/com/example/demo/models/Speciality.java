package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {
    private String description;

    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    public Speciality(String description) {
        this.description = description;
    }

    public Speciality() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}