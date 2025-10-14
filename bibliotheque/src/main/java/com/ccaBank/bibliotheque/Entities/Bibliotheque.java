package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bibliotheque")
@Data
public class Bibliotheque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nbre_etudiant", nullable = false)
    private Long nbreEtudiant;

    @Column(name = "nbre_enseignant", nullable = false)
    private Long nbreEnseignant;

    @Column(name = "nbre_personnel_administratf", nullable = false)
    private Long nbrePersoAdmin;

    @Column(name = "annee_academique", nullable = false)
    private String anneeAcademique;


}
