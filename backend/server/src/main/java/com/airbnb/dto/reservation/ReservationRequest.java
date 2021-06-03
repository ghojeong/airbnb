package com.airbnb.dto.reservation;

import com.airbnb.domain.reservation.Reservation;

public class ReservationRequest {

    private final String login;
    private final Long roomId;
    private final String checkIn;
    private final String checkOut;

    public ReservationRequest(String login, Long roomId, String checkIn, String checkOut) {
        this.login = login;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getLogin() {
        return login;
    }

    public Long getRoomId() {
        return roomId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public static Reservation from(ReservationRequest reservationRequest) {
        return new Reservation(reservationRequest.getLogin(), reservationRequest.getRoomId(),
                reservationRequest.checkIn, reservationRequest.checkOut);
    }
}
