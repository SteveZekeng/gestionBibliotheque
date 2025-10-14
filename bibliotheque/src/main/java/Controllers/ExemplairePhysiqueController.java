package Controllers;

import Services.ExemplairePhysiqueService;
import entities.ExemplairePhysique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExemplairePhysiqueController {

    @Autowired
    private ExemplairePhysiqueService exemplairePhysiqueService;

    @PostMapping
    public ExemplairePhysique addExemplaireP(@RequestBody ExemplairePhysique exemplaireP){
        return exemplairePhysiqueService.createExemplairePhysique(exemplaireP);
    }

    @GetMapping
    public ExemplairePhysique getExemplairePhysiqueById(@PathVariable Long id){
        return exemplairePhysiqueService.findExemById(id);
    }

    @GetMapping
    public List<ExemplairePhysique> getAllExemplaireP(){
        return exemplairePhysiqueService.findAllExemplairePhysique();
    }

    @PutMapping("/{id}")
    public ExemplairePhysique updateExemp(@PathVariable Long id,
                                          @RequestBody ExemplairePhysique exemplaireP){
        return exemplairePhysiqueService.updateExemplairePhysique(id, exemplaireP);
    }

    @DeleteMapping("/{id}")
    public void deleteExemplaireP(@PathVariable Long id){
        exemplairePhysiqueService.deleteExemplairePhysique(id);
    }
}
