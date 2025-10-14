package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliothequeRepository extends JpaRepository<Bibliotheque,Long> {
}
