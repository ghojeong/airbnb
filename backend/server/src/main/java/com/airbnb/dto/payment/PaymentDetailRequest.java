package com.airbnb.dto.payment;

public class PaymentDetailRequest {
    private Long roomId;
    private String checkIn;
    private String checkOut;
    private int adults;

    public Long getRoomId() {
        return roomId;
    }

    public PaymentDetailRequest setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public PaymentDetailRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public PaymentDetailRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }

    public int getAdults() {
        return adults;
    }

    public PaymentDetailRequest setAdults(int adults) {
        this.adults = adults;
        return this;
    }
}
