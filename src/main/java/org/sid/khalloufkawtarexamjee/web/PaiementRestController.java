package org.sid.khalloufkawtarexamjee.web;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.sid.khalloufkawtarexamjee.entities.Paiement;
import org.sid.khalloufkawtarexamjee.services.AssuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
@AllArgsConstructor
@CrossOrigin("*")
public class PaiementRestController {

    private AssuranceService assuranceService;

    @GetMapping
    public List<Paiement> paiements(){

        return assuranceService.getPaiements();
    }

    @PostMapping
    public Paiement save(
            @RequestBody Paiement paiement){

        return assuranceService.savePaiement(paiement);
    }
}