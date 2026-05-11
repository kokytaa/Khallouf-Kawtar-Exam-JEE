package org.sid.khalloufkawtarexamjee.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ContratAuto extends ContratAssurance {

    private String immatriculation;

    private String marque;

    private String modele;
}