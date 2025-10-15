package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}
