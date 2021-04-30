package TAASS.ServiceDBComuni.controllers;

import TAASS.ServiceDBComuni.models.Comune;
import TAASS.ServiceDBComuni.models.ComuneImportato;
import TAASS.ServiceDBComuni.repositories.ComuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comune")
public class ComuneController {
    @Autowired
    private ComuneRepository comuneRepository;

    @PostMapping
    public Comune addComune(@RequestBody Comune comune){
        System.out.println("# Aggiungi comune");
        System.out.println("#\tddComune: comune: " + comune.getIstat().toString() + " = " + comune.getNome());
        return comuneRepository.save(new Comune(comune.getIstat(),comune.getNome(), comune.getCAP(), comune.getProvincia()));
    }

    @GetMapping("/info-comune")
    public Optional<Comune> getComuneById(@RequestParam long id){
        return comuneRepository.findById(id);
    }

    @PostMapping("/inserisci-comuni")
    public void addComuni(@RequestBody List<ComuneImportato> comuni){

        for (ComuneImportato comuneImportato:comuni) {
            System.out.println("# Aggiungo comune");
            System.out.println("#\tddComune: comune: " + comuneImportato.getIstat() + " = " + comuneImportato.getComune());

            comuneRepository.save(new Comune(Long.parseLong(comuneImportato.getIstat()),comuneImportato.getComune(), "", comuneImportato.getProvincia()));
        }

    }
}
