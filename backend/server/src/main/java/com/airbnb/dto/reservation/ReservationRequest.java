package com.airbnb.dto.reservation;

import com.airbnb.domain.reservation.Reservation;
import com.airbnb.domain.room.Room;

import java.time.LocalDate;

public class ReservationRequest {

    private final Long id;
    private final Long userId;
    private final Room room;
    private final LocalDate checkIn;
    private final LocalDate checkOut;

    private ReservationRequest(Long id, Long userId, Room room, LocalDate checkIn, LocalDate checkOut) {
        this.id = id;
        this.userId = userId;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public static Reservation from(ReservationRequest reservationRequest) {
        return new Reservation(reservationRequest.getId(), reservationRequest.getUserId(), reservationRequest.getRoom(),
                reservationRequest.checkIn, reservationRequest.checkOut);
    }
}
