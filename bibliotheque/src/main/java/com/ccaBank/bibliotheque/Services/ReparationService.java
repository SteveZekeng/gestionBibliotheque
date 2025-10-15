package com.ccaBank.bibliotheque.Services;

import com.ccaBank.bibliotheque.Entities.Reparation;
import com.ccaBank.bibliotheque.Repositories.ReparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReparationService {

    @Autowired
    private ReparationRepository reparationRepository;

    public Reparation createReparation(Reparation reparation){
        return reparationRepository.save(reparation);
    }

    public Reparation findReparationById(Long id){
        return reparationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("reparation introuvable"));
    }
    public List<Reparation> findAllReparations(){
        return reparationRepository.findAll();
    }

    public Reparation updateReparation(Long id, Reparation reparation){
        Reparation rep = findReparationById(id);

        rep.setMembre(reparation.getMembre());
        rep.setExemplairePhysique(reparation.getExemplairePhysique());
        rep.setDateEtHeureReception(reparation.getDateEtHeureReception());

        return reparationRepository.save(rep);
    }

    public void deleteReparation(Long id){
        reparationRepository.deleteById(id);
    }
}
