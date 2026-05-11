package org.sid.khalloufkawtarexamjee.repositories;

import org.sid.khalloufkawtarexamjee.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository
        extends JpaRepository<Paiement,Long> {
}