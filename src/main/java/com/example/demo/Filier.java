package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="filier")
public class Filier {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filiere_id;
    private String nom;

    public int getFiliere_id() {
        return filiere_id;
    }

    public void setFiliere_id(int filiere_id) {
        this.filiere_id = filiere_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
