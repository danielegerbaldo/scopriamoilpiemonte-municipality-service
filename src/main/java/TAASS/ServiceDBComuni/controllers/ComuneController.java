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

    @GetMapping("/info-comune")
    public Optional<Comune> getComuneById(@PathVariable long comuneID){
        return comuneRepository.findById(comuneID);
    }

    @GetMapping("/genera-indirizzo-via-id")
    public String getIndirizzoGenerato(@RequestBody String via, @RequestBody long comuneID){
        Optional<Comune> comune = getComuneById(comuneID);
        if(comune.isPresent()){
            return comune.get().generaIndirizzo(via);
        }else{
            return "Non esiste il comune richiesto";
        }
    }

    @GetMapping("/genera-indirizzo-via-comune")
    public String getIndirizzoGenerato(@RequestBody String via, @RequestBody Comune comune){
        return comune.generaIndirizzo(via);
    }
}
