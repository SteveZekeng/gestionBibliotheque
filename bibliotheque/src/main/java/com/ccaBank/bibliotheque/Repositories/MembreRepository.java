package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<Membre,Long> {
}
