package org.sid.khalloufkawtarexamjee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.sid.khalloufkawtarexamjee.enums.TypeLogement;

@Entity
@Data
public class ContratHabitation extends ContratAssurance {

    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;

    private String adresse;

    private double superficie;
}