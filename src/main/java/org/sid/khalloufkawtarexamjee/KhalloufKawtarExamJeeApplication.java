package org.sid.khalloufkawtarexamjee;

import org.sid.khalloufkawtarexamjee.entities.Client;
import org.sid.khalloufkawtarexamjee.entities.ContratAuto;
import org.sid.khalloufkawtarexamjee.enums.StatutContrat;
import org.sid.khalloufkawtarexamjee.repositories.ClientRepository;
import org.sid.khalloufkawtarexamjee.repositories.ContratRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class KhalloufKawtarExamJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhalloufKawtarExamJeeApplication.class, args);
    }


    @Bean
    CommandLineRunner start(
            ClientRepository clientRepository,
            ContratRepository contratRepository) {

        return args -> {

            // Création client
            Client client = Client.builder()
                    .nom("Kawtar")
                    .email("kawtar@gmail.com")
                    .build();

            clientRepository.save(client);

            // Création contrat auto
            ContratAuto auto = new ContratAuto();

            auto.setDateSouscription(LocalDate.now());
            auto.setStatut(StatutContrat.EN_COURS);
            auto.setMontantCotisation(5000);
            auto.setDureeContrat(12);
            auto.setTauxCouverture(80);

            auto.setImmatriculation("123-A-45");
            auto.setMarque("BMW");
            auto.setModele("X6");

            auto.setClient(client);

            contratRepository.save(auto);

            System.out.println("Client ajouté avec succès !");
            System.out.println("Contrat auto ajouté !");
        };
    }
}