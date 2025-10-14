package Controllers;

import Services.BibliothequeService;
import entities.Bibliotheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BibliothequeController {

    @Autowired
    BibliothequeService bibliothequeService;

    @PostMapping
    public Bibliotheque addBibliotheque(@RequestBody Bibliotheque bibliotheque) {
        return bibliothequeService.createBiblio(bibliotheque);
    }

    @GetMapping
    public List<Bibliotheque> getAllBibliotheque(){
        return bibliothequeService.findAllBibliotheque();
    }

    @PutMapping("/{id}")
    public Bibliotheque updateBibliotheque(@PathVariable Long id, @RequestBody Bibliotheque bibliotheque) {
        return bibliothequeService.updateBiblio(id, bibliotheque);
    }

    @DeleteMapping("/{id}")
    public void deleteBibliotheque(@PathVariable Long id) {
        bibliothequeService.delete(id);
    }
}
