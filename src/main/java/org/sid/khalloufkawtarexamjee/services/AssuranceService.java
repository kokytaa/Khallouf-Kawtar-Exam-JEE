package org.sid.khalloufkawtarexamjee.services;

import org.sid.khalloufkawtarexamjee.dtos.ClientDTO;
import org.sid.khalloufkawtarexamjee.entities.ContratAssurance;
import org.sid.khalloufkawtarexamjee.entities.Paiement;

import java.util.List;

public interface AssuranceService {
    ClientDTO saveClient(ClientDTO dto);

    List<ClientDTO> getClients();

    ClientDTO getClient(Long id);

    void deleteClient(Long id);

    ContratAssurance saveContrat(ContratAssurance contrat);

    List<ContratAssurance> getContrats();

    List<ContratAssurance> getContratsByClient(Long clientId);

    Paiement savePaiement(Paiement paiement);

    List<Paiement> getPaiements();
}
