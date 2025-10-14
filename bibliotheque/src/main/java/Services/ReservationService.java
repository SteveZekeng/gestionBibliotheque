package Services;

import Repositories.ReservationRepository;
import entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> findAllReservation() {
        return reservationRepository.findAll();
    }

    public Reservation findReservationById(Long id) {
        return reservationRepository.findById(id).get();
    }

    public Reservation updateReservation(Long id, Reservation reservation) {
        Reservation reserv = reservationRepository.findById(id).get();

        reserv.setStatutReservation(reservation.getStatutReservation());
        reserv.setDateEtHeure(reservation.getDateEtHeure());
        reserv.setNbreHeure(reservation.getNbreHeure());
        reserv.setTypeEspace(reservation.getTypeEspace());

        return reservationRepository.save(reserv);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
