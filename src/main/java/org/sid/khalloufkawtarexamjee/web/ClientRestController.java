package org.sid.khalloufkawtarexamjee.web;

import lombok.AllArgsConstructor;
import org.sid.khalloufkawtarexamjee.dtos.ClientDTO;
import org.sid.khalloufkawtarexamjee.services.AssuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@AllArgsConstructor
@CrossOrigin("*")
public class ClientRestController {

    private AssuranceService assuranceService;

    @GetMapping
    public List<ClientDTO> getClients(){

        return assuranceService.getClients();
    }

    @PostMapping
    public ClientDTO saveClient(
            @RequestBody ClientDTO dto){

        return assuranceService.saveClient(dto);
    }

    @GetMapping("/{id}")
    public ClientDTO getClient(
            @PathVariable Long id){

        return assuranceService.getClient(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(
            @PathVariable Long id){

        assuranceService.deleteClient(id);
    }
}