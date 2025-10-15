package com.ccaBank.bibliotheque.Services;

import com.ccaBank.bibliotheque.Entities.Emprunt;
import com.ccaBank.bibliotheque.Repositories.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpruntService {

    @Autowired
    private EmpruntRepository empruntRepository;

    public Emprunt createEmprunt(Emprunt emprunt){
        return empruntRepository.save(emprunt);
    }

    public Emprunt findEmpruntById(Long id){
        return empruntRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("emprunt inexistant"));
    }

    public List<Emprunt> findAllEmprunts(){
        return empruntRepository.findAll();
    }

    public Emprunt updateEmprunt(Long id, Emprunt emprunt){
        Emprunt emp = findEmpruntById(id);

        emp.setDateEmprunt(emprunt.getDateEmprunt());
        emp.setDureeEmprunt(emprunt.getDureeEmprunt());
        emp.setMembre(emprunt.getMembre());

        return empruntRepository.save(emp);
    }

    public void deleteEmprunt(Long id){
        empruntRepository.deleteById(id);
    }
}
