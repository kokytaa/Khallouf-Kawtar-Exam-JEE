package org.sid.khalloufkawtarexamjee.repositories;

import org.sid.khalloufkawtarexamjee.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository
        extends JpaRepository<Client,Long> {
}
