package com.ccaBank.bibliotheque.Controllers;

import com.ccaBank.bibliotheque.Entities.Reparation;
import com.ccaBank.bibliotheque.Services.ReparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblio/reparation")
public class ReparationController {

    @Autowired
    private ReparationService reparationService;

    @PostMapping
    public Reparation addReparation(@RequestBody Reparation reparation){
        return reparationService.createReparation(reparation);
    }

    @GetMapping
    public List<Reparation> getAllReparations(){
        return reparationService.findAllReparations();
    }

    @GetMapping("/{id}")
    public Reparation getReparationById(@PathVariable Long id){
        return reparationService.findReparationById(id);
    }

    @PutMapping("/{id}")
    public Reparation updateReparationById(@PathVariable Long id,
                                           @RequestBody Reparation reparation){
        return reparationService.updateReparation(id, reparation);
    }

    @DeleteMapping("/{id}")
    public void deleteReparationById(@PathVariable Long id){
        reparationService.deleteReparation(id);
    }
}
