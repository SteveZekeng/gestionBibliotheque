package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
