package com.airbnb.dto.payment;

public class PaymentDetailsRequest {
    private final Long roomId;
    private final String checkIn;
    private final String checkOut;
    private final int adults;

    public PaymentDetailsRequest(Long roomId, String checkIn, String checkOut, int adults) {
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.adults = adults;
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

    public int getAdults() {
        return adults;
    }
}
