package com.airbnb.dto.payment;

public class PaymentDetailsRequest {
    private Long roomId;
    private String checkIn;
    private String checkOut;
    private int adults;

    public Long getRoomId() {
        return roomId;
    }

    public PaymentDetailsRequest setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public PaymentDetailsRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public PaymentDetailsRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }

    public int getAdults() {
        return adults;
    }

    public PaymentDetailsRequest setAdults(int adults) {
        this.adults = adults;
        return this;
    }
}
