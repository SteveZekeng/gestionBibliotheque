package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "membres")
@Data
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_membre")
    private TypeMembre typeMembre;

    @Enumerated(EnumType.STRING)
    @Column(name = "preference_notification")
    private PreferenceNotification preferenceNotification = PreferenceNotification.SMS;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    private String niveau;

    private String filiere;

    @OneToMany(mappedBy = "membre", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "membre", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List <Reparation> reparations;

    @OneToMany(mappedBy = "membre", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List <Emprunt> emprunts;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "abonnement_id", referencedColumnName = "id")
    private Abonnement abonnement;
}
