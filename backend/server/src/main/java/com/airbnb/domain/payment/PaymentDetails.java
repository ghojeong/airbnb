package com.airbnb.domain.payment;

public class PaymentDetails {
    private final Integer totalRoomPrice;
    private final float discount;
    private final Integer cleaningFee;
    private final Integer serviceFee;
    private final float roomTax;

    public PaymentDetails(Integer totalRoomPrice, float discount, Integer cleaningFee, Integer serviceFee, float roomTax) {
        this.totalRoomPrice = totalRoomPrice;
        this.discount = discount;
        this.cleaningFee = cleaningFee;
        this.serviceFee = serviceFee;
        this.roomTax = roomTax;
    }

    public Integer getTotalRoomPrice() {
        return totalRoomPrice;
    }

    public float getDiscount() {
        return discount;
    }

    public Integer getCleaningFee() {
        return cleaningFee;
    }

    public Integer getServiceFee() {
        return serviceFee;
    }

    public float getRoomTax() {
        return roomTax;
    }
}
