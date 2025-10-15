package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_emprunt")
    private LocalDate dateEmprunt;

    @Column(name = "nbre_de_jours")
    private int dureeEmprunt;

    @ManyToOne
    @JoinColumn(name = "membre_id")
    private Membre membre;

    @ManyToMany(mappedBy = "emprunts")
    private List<Document> documents;
}
