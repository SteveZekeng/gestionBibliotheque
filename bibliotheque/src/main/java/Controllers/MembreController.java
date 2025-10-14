package Controllers;

import Services.MembreService;
import entities.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MembreController {

    @Autowired
    private MembreService membreService;

    @PostMapping
    public Membre addMembre(@RequestBody Membre membre) {
        return membreService.createMembre(membre);
    }

    @GetMapping
    public List<Membre> getAllMembre() {
        return membreService.findAllMembre();
    }

    @GetMapping
    public Membre getMembreByid(@PathVariable Long id){
        return membreService.findMembreById(id);
    }

    @PutMapping("/{id}")
    public Membre updateMembreById(@PathVariable Long id, @RequestBody Membre membre) {
        return  membreService.updateMembre(id, membre);
    }

    @DeleteMapping("/{id}")
    public void deleteMembreByid(@PathVariable Long id){
        membreService.deleteMembre(id);
    }

}
