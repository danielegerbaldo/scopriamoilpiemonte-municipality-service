package TAASS.ServiceDBComuni.controllers;

import TAASS.ServiceDBComuni.models.Comune;
import TAASS.ServiceDBComuni.repositories.ComuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comune")
public class ComuneController {
    @Autowired
    private ComuneRepository comuneRepository;

    @PostMapping
    public Comune addComune(@RequestBody Comune comune){
        System.out.println("# Aggiungi comune");
        System.out.println("#\tddComune: comune: " + comune.getId().toString() + " = " + comune.getNome());
        return comuneRepository.save(new Comune(comune.getId(),comune.getNome(), comune.getCAP(), comune.getProvincia()));
    }

    @GetMapping("/info-comune")
    public Optional<Comune> getComuneById(@RequestParam long id){
        return comuneRepository.findById(id);
    }

}
