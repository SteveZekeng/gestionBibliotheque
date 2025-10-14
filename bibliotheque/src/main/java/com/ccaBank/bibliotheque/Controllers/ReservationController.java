package com.ccaBank.bibliotheque.Controllers;

import com.ccaBank.bibliotheque.Services.ReservationService;
import com.ccaBank.bibliotheque.Entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblio/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.findAllReservation();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.findReservationById(id);
    }

    @PutMapping("/{id}")
    public Reservation updateReservationById(@PathVariable Long id,
                                             @RequestBody Reservation reservation){
        return reservationService.updateReservation(id, reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}
