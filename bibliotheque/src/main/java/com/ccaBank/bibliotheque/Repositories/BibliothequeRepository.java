package com.ccaBank.bibliotheque.Repositories;

import com.ccaBank.bibliotheque.Entities.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliothequeRepository extends JpaRepository<Bibliotheque,Long> {

//    @Query("SELECT b FROM Bibliotheque b WHERE b.adresse LIKE %:ville%")
//    List<Bibliotheque> findByVille(@Param("ville") String ville);
//
//
//    @Query("SELECT b FROM Bibliotheque b ORDER BY b.nom ASC")
//    List<Bibliotheque> findAllOrderByNom();
//
//
//    @Query("SELECT b FROM Bibliotheque b WHERE b.nom = :nom")
//    Bibliotheque findByNomExact(@Param("nom") String nom);
}
