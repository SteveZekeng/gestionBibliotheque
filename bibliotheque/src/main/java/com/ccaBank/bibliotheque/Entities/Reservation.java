package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservations")
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_espace")
    private TypeEspace typeEspace;

    @Column(name = "nbre_heure")
    private String nbreHeure;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut_reservation")
    private StatutReservation statutReservation;

    @Column(name = "date_et_heure")
    private String dateEtHeure;

    @ManyToOne
    @JoinColumn(name = "membre_id", nullable = false)
    private Membre membre;
}
