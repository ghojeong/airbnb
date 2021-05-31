package com.airbnb.domain.reservation;

import com.airbnb.domain.room.Room;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Reservation {

    @Id
    private final Long id;
    private final Long userId;
    private final Room room;
    private final LocalDate checkIn;
    private final LocalDate checkOut;

    public Reservation(Long id, Long userId, Room room, LocalDate checkIn, LocalDate checkOut) {
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
}
