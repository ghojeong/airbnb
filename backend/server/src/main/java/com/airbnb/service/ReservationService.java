package com.airbnb.service;

import com.airbnb.dto.reservation.ReservationRequest;
import com.airbnb.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public void save(ReservationRequest reservation) {
        reservationRepository.save(ReservationRequest.from(reservation));
    }

    public List<Long> findReservationRoomsByPeriod(LocalDateTime checkIn, LocalDateTime checkOut) {
        List<Long> rooms = reservationRepository.findRoomsByPeriod(checkIn, checkOut);
        return null;
    }
}
