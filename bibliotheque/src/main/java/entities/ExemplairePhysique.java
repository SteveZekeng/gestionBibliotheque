package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exemplaires_physiques")
@Data
public class ExemplairePhysique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @Column(unique = true, name = "code_barre",nullable = false)
    private String codeBarreUnique;

    @Enumerated(EnumType.STRING)
    private EtatConservation etat;

    @Enumerated(EnumType.STRING)
    @Column(name = "localisation")
    private LocalisationExemplaire localisationExemplaire;

    @Column(name = "date_acquisition")
    private String dateAcquisition;

    private String prix;
}
