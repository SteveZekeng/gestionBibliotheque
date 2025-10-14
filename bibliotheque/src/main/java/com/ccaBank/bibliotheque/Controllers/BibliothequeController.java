package com.ccaBank.bibliotheque.Controllers;

import com.ccaBank.bibliotheque.Services.BibliothequeService;
import com.ccaBank.bibliotheque.Entities.Bibliotheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblio/bibliotheque")
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
