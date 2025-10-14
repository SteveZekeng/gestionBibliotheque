package Services;

import Repositories.BibliothequeRepository;
import entities.Bibliotheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliothequeService {

    @Autowired
    private BibliothequeRepository bibliothequeRepository;

    public Bibliotheque createBiblio(Bibliotheque bibliotheque) {
        return bibliothequeRepository.save(bibliotheque);
    }

    public List<Bibliotheque> findAllBibliotheque() {
        return bibliothequeRepository.findAll();
    }

    public Bibliotheque updateBiblio(Long id, Bibliotheque bibliotheque) {
        Bibliotheque biblio = bibliothequeRepository.findById(id).get();

        biblio.setNbreEtudiant(bibliotheque.getNbreEtudiant());
        biblio.setNbreEnseignant(bibliotheque.getNbreEnseignant());
        biblio.setNbrePersoAdmin(bibliotheque.getNbrePersoAdmin());
        biblio.setAnneeAcademique(bibliotheque.getAnneeAcademique());

        return bibliothequeRepository.save(biblio);
    }

    public void delete(Long id) {
        bibliothequeRepository.deleteById(id);
    }

}
