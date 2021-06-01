package com.airbnb.domain.room;

public class Payment {
    private final Integer price;
    private final Float discount;
    private final Integer cleaningFee;
    private final Integer serviceFee;
    private final Float roomTax;

    public Payment(Integer price, float discount, Integer cleaningFee, Integer serviceFee, float roomTax) {
        this.price = price;
        this.discount = discount;
        this.cleaningFee = cleaningFee;
        this.serviceFee = serviceFee;
        this.roomTax = roomTax;
    }

    public Integer getPrice() {
        return price;
    }

    public Float getDiscount() {
        return discount;
    }

    public Integer getCleaningFee() {
        return cleaningFee;
    }

    public Integer getServiceFee() {
        return serviceFee;
    }

    public Float getRoomTax() {
        return roomTax;
    }
}
