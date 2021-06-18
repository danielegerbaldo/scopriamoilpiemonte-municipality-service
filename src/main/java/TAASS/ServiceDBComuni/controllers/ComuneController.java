package TAASS.ServiceDBComuni.controllers;

import TAASS.ServiceDBComuni.models.CAPImportato;
import TAASS.ServiceDBComuni.models.Comune;
import TAASS.ServiceDBComuni.models.ComuneImportato;
import TAASS.ServiceDBComuni.models.GeoImportato;
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
        System.out.println("#\tComune: comune: " + comune.getIstat().toString() + " = " + comune.getNome());
        return comuneRepository.save(new Comune(comune.getIstat(),comune.getNome(), comune.getCAP(), comune.getRegione(), comune.getProvincia()));
    }

    @GetMapping("/info-comune/")
    public List<Comune> getAllComuni(){
        return comuneRepository.findAll();
    }

    @GetMapping("/info-comune/{id}")
    public Comune getComuneById(@PathVariable long id){
        return comuneRepository.findByIstat(id);
    }

    @PostMapping("/inserisci-comuni")
    public void addComuni(@RequestBody List<ComuneImportato> comuni){

        for (ComuneImportato comuneImportato:comuni) {
            System.out.println("# Aggiungo comune");
            System.out.println("#\tComune: comune: " + comuneImportato.getIstat() + " = " + comuneImportato.getComune());

            comuneRepository.save(new Comune(Long.parseLong(comuneImportato.getIstat()),comuneImportato.getComune(), "", "", comuneImportato.getProvincia()));
        }

    }


    @PostMapping("/inserisci-cap")
    public void addCap(@RequestBody List<CAPImportato> cap){

        for (CAPImportato capImportato:cap) {
            System.out.println("# Aggiungo CAP");
            System.out.println("#\tComune: " + capImportato.getIstat() + " = " + capImportato.getCAP());

            Comune comune = comuneRepository.findByIstat(Long.parseLong(capImportato.getIstat()));
            comune.setCAP(capImportato.getCAP());

            comuneRepository.save(comune);
        }

    }

    @PostMapping("/inserisci-geo")
    public void addGeo(@RequestBody List<GeoImportato> geo){

        for (GeoImportato geoImportato:geo) {
            System.out.println("# Aggiungo GEO");
            System.out.println("#\tComune: " + geoImportato.getIstat() + " \n\t Lat:" + geoImportato.getLat() + "\n\t Lon:" + geoImportato.getLat());

            Comune comune = comuneRepository.findByIstat(Long.parseLong(geoImportato.getIstat()));
            comune.setLat(Double.parseDouble(geoImportato.getLat()));
            comune.setLng(Double.parseDouble(geoImportato.getLng()));

            comuneRepository.save(comune);
        }

    }
}
