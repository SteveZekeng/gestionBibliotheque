package Repositories;

import entities.ExemplairePhysique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExemplairePhysiqueRepository extends JpaRepository<ExemplairePhysique,Long> {
}
