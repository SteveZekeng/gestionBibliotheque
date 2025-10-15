package com.ccaBank.bibliotheque.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "documents")
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "document_type")
    private TypeDocument typeDocument = TypeDocument.livre;

    @Enumerated(EnumType.STRING)
    private Localisation localisation = Localisation.rayonnage;

    private String titre;

    private String description;

    private String auteur;

    @ManyToMany
    @JoinTable(
            name = "document_emprunt",
            joinColumns = @JoinColumn(name = "document_id"),
            inverseJoinColumns = @JoinColumn(name = "emprunt_id")
    )
    private List <Emprunt> emprunts;


}
