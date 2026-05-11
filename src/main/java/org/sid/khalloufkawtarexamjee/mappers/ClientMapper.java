package org.sid.khalloufkawtarexamjee.mappers;

import org.sid.khalloufkawtarexamjee.dtos.ClientDTO;
import org.sid.khalloufkawtarexamjee.entities.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {
    public ClientDTO fromClient(Client client){

        ClientDTO dto = new ClientDTO();

        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setEmail(client.getEmail());

        return dto;
    }
}
