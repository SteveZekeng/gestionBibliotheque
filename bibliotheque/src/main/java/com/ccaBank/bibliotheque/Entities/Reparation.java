package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reparation")
@Data
public class Reparation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_et_heure_de_retour")
    private String dateEtHeureReception;

    @ManyToOne
    @JoinColumn(name = "exemplaire_id", nullable = false)
    private ExemplairePhysique exemplairePhysique;

    @ManyToOne
    @JoinColumn(name = "membre_id", nullable = false)
    private Membre membre;
}
