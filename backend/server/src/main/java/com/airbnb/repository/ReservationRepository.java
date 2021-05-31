package com.airbnb.repository;

import com.airbnb.domain.reservation.Reservation;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReservationRepository {

    List<Reservation> reservations = new ArrayList<>();

    public void save(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> findAll() {
        return reservations;
    }

    public List<Long> findReservedRoom(LocalDateTime checkIn, LocalDateTime checkOut) {
        return reservations;
    }
}
