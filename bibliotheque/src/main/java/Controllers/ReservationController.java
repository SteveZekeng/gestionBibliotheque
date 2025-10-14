package Controllers;

import Services.ReservationService;
import entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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

    @GetMapping
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
