package com.ccaBank.bibliotheque.Services;

import com.ccaBank.bibliotheque.Repositories.ExemplairePhysiqueRepository;
import com.ccaBank.bibliotheque.Entities.ExemplairePhysique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExemplairePhysiqueService {

    @Autowired
    private ExemplairePhysiqueRepository exemplairePhysiqueRepository;

    public ExemplairePhysique createExemplairePhysique(ExemplairePhysique exemplairePhysique) {
        return exemplairePhysiqueRepository.save(exemplairePhysique);
    }

    public List<ExemplairePhysique> findAllExemplairePhysique() {
        return exemplairePhysiqueRepository.findAll();
    }

    public ExemplairePhysique findExemById(Long id) {
        return exemplairePhysiqueRepository.findById(id).get();
    }

    public ExemplairePhysique updateExemplairePhysique(Long id,
                                                       ExemplairePhysique exemplairePhysique) {
        ExemplairePhysique exemp = exemplairePhysiqueRepository.findById(id).get();

        exemp.setLocalisationExemplaire(exemplairePhysique.getLocalisationExemplaire());
        exemp.setEtat(exemplairePhysique.getEtat());
        exemp.setPrix(exemplairePhysique.getPrix());
        exemp.setCodeBarreUnique(exemplairePhysique.getCodeBarreUnique());
        exemp.setDateAcquisition(exemplairePhysique.getDateAcquisition());

        return exemplairePhysiqueRepository.save(exemp);
    }

    public void deleteExemplairePhysique(Long id) {
        exemplairePhysiqueRepository.deleteById(id);
    }
}
