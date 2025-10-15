package com.ccaBank.bibliotheque.Services;

import com.ccaBank.bibliotheque.Repositories.MembreRepository;
import com.ccaBank.bibliotheque.Entities.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreService {

    @Autowired
    private MembreRepository membreRepository;

    public Membre createMembre(Membre membre) {
        return membreRepository.save(membre);
    }

    public List<Membre> findAllMembre() {
        return membreRepository.findAll();
    }

    public Membre findMembreById(Long id) {
        return membreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("membre introuvable"));
    }

    public Membre updateMembre(Long id, Membre membre) {
        Membre mem = membreRepository.findById(id).get();

        mem.setTypeMembre(membre.getTypeMembre());
        mem.setStatut(membre.getStatut());
        mem.setFiliere(membre.getFiliere());
        mem.setNiveau(membre.getNiveau());
        mem.setPreferenceNotification(membre.getPreferenceNotification());

        return membreRepository.save(mem);
    }

    public void deleteMembre(Long id) {
        membreRepository.deleteById(id);
    }

}
