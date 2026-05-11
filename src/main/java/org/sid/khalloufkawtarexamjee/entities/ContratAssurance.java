package org.sid.khalloufkawtarexamjee.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.sid.khalloufkawtarexamjee.enums.StatutContrat;


import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class ContratAssurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateSouscription;

    @Enumerated(EnumType.STRING)
    private StatutContrat statut;

    private LocalDate dateValidation;

    private double montantCotisation;

    private int dureeContrat;

    private double tauxCouverture;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "contrat")
    private List<Paiement> paiements;
}
