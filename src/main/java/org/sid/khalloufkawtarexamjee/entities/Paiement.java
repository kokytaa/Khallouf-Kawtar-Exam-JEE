package org.sid.khalloufkawtarexamjee.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.sid.khalloufkawtarexamjee.enums.TypePaiement;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Data
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate datePaiement;

    private double montant;

    @Enumerated(EnumType.STRING)
    private TypePaiement typePaiement;

    @ManyToOne
    private ContratAssurance contrat;
}