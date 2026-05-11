package org.sid.khalloufkawtarexamjee.services;

import lombok.AllArgsConstructor;
import org.sid.khalloufkawtarexamjee.dtos.ClientDTO;
import org.sid.khalloufkawtarexamjee.entities.Client;
import org.sid.khalloufkawtarexamjee.entities.ContratAssurance;
import org.sid.khalloufkawtarexamjee.entities.Paiement;
import org.sid.khalloufkawtarexamjee.repositories.ClientRepository;
import org.sid.khalloufkawtarexamjee.repositories.ContratRepository;
import org.sid.khalloufkawtarexamjee.repositories.PaiementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AssuranceServiceImpl implements AssuranceService {

    private ClientRepository clientRepository;
    private ContratRepository contratRepository;
    private PaiementRepository paiementRepository;

    @Override
    public ClientDTO saveClient(ClientDTO dto) {

        Client client = Client.builder()
                .nom(dto.getNom())
                .email(dto.getEmail())
                .build();

        Client savedClient = clientRepository.save(client);

        ClientDTO clientDTO = new ClientDTO();

        clientDTO.setId(savedClient.getId());
        clientDTO.setNom(savedClient.getNom());
        clientDTO.setEmail(savedClient.getEmail());

        return clientDTO;
    }

    @Override
    public List<ClientDTO> getClients() {

        List<Client> clients = clientRepository.findAll();

        return clients.stream().map(client -> {

            ClientDTO dto = new ClientDTO();

            dto.setId(client.getId());
            dto.setNom(client.getNom());
            dto.setEmail(client.getEmail());

            return dto;

        }).toList();
    }

    @Override
    public ClientDTO getClient(Long id) {

        Client client = clientRepository.findById(id).orElse(null);

        ClientDTO dto = new ClientDTO();

        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setEmail(client.getEmail());

        return dto;
    }

    @Override
    public void deleteClient(Long id) {

        clientRepository.deleteById(id);
    }

    @Override
    public ContratAssurance saveContrat(ContratAssurance contrat) {

        return contratRepository.save(contrat);
    }

    @Override
    public List<ContratAssurance> getContrats() {

        return contratRepository.findAll();
    }

    @Override
    public List<ContratAssurance> getContratsByClient(Long clientId) {

        return contratRepository.findAll()
                .stream()
                .filter(c -> c.getClient().getId().equals(clientId))
                .toList();
    }

    @Override
    public Paiement savePaiement(Paiement paiement) {

        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> getPaiements() {

        return paiementRepository.findAll();
    }
}