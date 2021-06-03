package com.airbnb.domain.reservation;

public class Reservation {

    private final String login;
    private final Long roomId;
    private final String checkIn;
    private final String checkOut;

    public Reservation(String login, Long roomId, String checkIn, String checkOut) {
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
}
