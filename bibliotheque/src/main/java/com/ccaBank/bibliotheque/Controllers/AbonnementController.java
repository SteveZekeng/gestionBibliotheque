package com.ccaBank.bibliotheque.Controllers;

import com.ccaBank.bibliotheque.Entities.Abonnement;
import com.ccaBank.bibliotheque.Services.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblio/abonnement")
public class AbonnementController {

    @Autowired
    public AbonnementService abonnementService;

    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.createAbonnement(abonnement);
    }

    @GetMapping
    public List<Abonnement> getAllAbonnements(){
        return abonnementService.findAllAbonnements();
    }

    @GetMapping("/{id}")
    public Abonnement getAbonnementById(@PathVariable Long id){
        return abonnementService.findAbonnementById(id);
    }

    @PutMapping("/{id}")
    public Abonnement updateAbonnementById(@PathVariable Long id,
                                           @RequestBody Abonnement abonnement){
        return abonnementService.updateAbonnement(id, abonnement);
    }

    @DeleteMapping("/{id}")
    public void deleteAbonnementById(@PathVariable Long id){
        abonnementService.deleteAbonnement(id);
    }
}
