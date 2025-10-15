package com.ccaBank.bibliotheque;

import com.ccaBank.bibliotheque.Entities.*;
import com.ccaBank.bibliotheque.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BibliothequeApplication implements CommandLineRunner {

    @Autowired
    private BibliothequeService bibliothequeService;
    @Autowired
    private MembreService membreService;
    @Autowired
    private AbonnementService abonnementService;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private EmpruntService empruntService;
    @Autowired
    private ExemplairePhysiqueService  exemplairePhysiqueService;
    @Autowired
    private ReparationService  reparationService;
    @Autowired
    private ReservationService reservationService;

	public static void main(String[] args) {
		SpringApplication.run(BibliothequeApplication.class, args);}


    @Override
    public void run(String... args) throws Exception {

        Bibliotheque bibliotheque1 = new Bibliotheque();

        bibliotheque1.setAnneeAcademique("2025/2026");
        bibliotheque1.setNbreEtudiant(25000);
        bibliotheque1.setNbreEnseignant(1500);
        bibliotheque1.setNbrePersoAdmin(800);

//        bibliothequeService.createBiblio(bibliotheque1);

        Membre membre1 = new Membre();

        membre1.setTypeMembre(TypeMembre.etudiant);
        membre1.setNiveau("Niveau 5");
        membre1.setFiliere("Data Science et IA");
        membre1.setStatut(Statut.actif);
        membre1.setPreferenceNotification(PreferenceNotification.email);

        Emprunt emprunt1 = new Emprunt();

        LocalDate date1 = LocalDate.of(2025, 10, 9);
        emprunt1.setDureeEmprunt(7);
        emprunt1.setDateEmprunt(date1);
        emprunt1.setMembre(membre1);

//        membreService.createMembre(membre1);
//        empruntService.createEmprunt(emprunt1);

//        System.out.println(bibliothequeService.findAllBibliotheque());
//        System.out.println(membreService.findAllMembre());
//        System.out.println(empruntService.findAllEmprunts());

    }

}
