package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.Reparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparationRepository extends JpaRepository<Reparation, Long> {
}
