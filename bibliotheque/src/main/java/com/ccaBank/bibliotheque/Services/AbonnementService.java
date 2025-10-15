package com.ccaBank.bibliotheque.Services;

import com.ccaBank.bibliotheque.Entities.Abonnement;
import com.ccaBank.bibliotheque.Repositories.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementService {

    @Autowired
    private AbonnementRepository abonnementRepository;

    public Abonnement createAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }

    public Abonnement findAbonnementById(Long id){
        return abonnementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("abonnement introuvable"));
    }

    public List<Abonnement> findAllAbonnements(){
        return abonnementRepository.findAll();
    }

    public Abonnement updateAbonnement(Long id, Abonnement abonnement){
        Abonnement abonn = findAbonnementById(id);

        abonn.setDateDebut(abonnement.getDateDebut());
        abonn.setStatut(abonnement.getStatut());
        abonn.setDateFin(abonnement.getDateFin());
        abonn.setMembre(abonnement.getMembre());

        return  abonnementRepository.save(abonn);
    }

    public void deleteAbonnement(Long id){
        abonnementRepository.deleteById(id);
    }

}
