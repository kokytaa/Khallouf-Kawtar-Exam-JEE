package org.sid.khalloufkawtarexamjee.web;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.sid.khalloufkawtarexamjee.entities.ContratAssurance;
import org.sid.khalloufkawtarexamjee.services.AssuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
@AllArgsConstructor
@CrossOrigin("*")
public class ContratRestController {

    private AssuranceService assuranceService;

    @GetMapping
    public List<ContratAssurance> contrats(){

        return assuranceService.getContrats();
    }

    @PostMapping
    public ContratAssurance save(
            @RequestBody ContratAssurance contrat){

        return assuranceService.saveContrat(contrat);
    }
}