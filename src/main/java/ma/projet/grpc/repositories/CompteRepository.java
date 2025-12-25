package ma.projet.grpc.repositories;

import ma.projet.grpc.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour la gestion des comptes
 */
@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
}
