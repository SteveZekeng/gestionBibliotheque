package com.ccaBank.bibliotheque.Controllers;

import com.ccaBank.bibliotheque.Entities.Emprunt;
import com.ccaBank.bibliotheque.Services.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblio/emprunt")
public class EmpruntController {

    @Autowired
    private EmpruntService empruntService;

    @PostMapping
    public Emprunt addEmprunt(@RequestBody Emprunt emprunt){
        return empruntService.createEmprunt(emprunt);
    }

    @GetMapping
    public List<Emprunt> getAllEmprunts(){
        return empruntService.findAllEmprunts();
    }

    @GetMapping("/{id}")
    public Emprunt getEmpruntById(@PathVariable Long id){
        return empruntService.findEmpruntById(id);
    }

    @PutMapping("/{id}")
    public Emprunt updateEmpruntById(@PathVariable Long id,
                                     @RequestBody Emprunt emprunt){
        return empruntService.updateEmprunt(id, emprunt);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpruntById(@PathVariable Long id){
        empruntService.deleteEmprunt(id);
    }
}
