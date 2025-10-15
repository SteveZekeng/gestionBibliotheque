package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.ExemplairePhysique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExemplairePhysiqueRepository extends JpaRepository<ExemplairePhysique,Long> {
}
