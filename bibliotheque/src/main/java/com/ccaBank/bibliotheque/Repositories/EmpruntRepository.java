package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
}
