package com.airbnb.dto.payment;

import com.airbnb.domain.room.Payment;

public class PaymentDetailsDto {
    private final Integer totalRoomPrice;
    private final float discount;
    private final Integer cleaningFee;
    private final Integer serviceFee;
    private final float roomTax;

    public PaymentDetailsDto(Integer totalRoomPrice, float discount, Integer cleaningFee, Integer serviceFee, float roomTax) {
        this.totalRoomPrice = totalRoomPrice;
        this.discount = discount;
        this.cleaningFee = cleaningFee;
        this.serviceFee = serviceFee;
        this.roomTax = roomTax;
    }

    private PaymentDetailsDto(Payment payment) {
        this.totalRoomPrice = payment.getTotalRoomPrice();
        this.discount = payment.getDiscount();
        this.cleaningFee = payment.getCleaningFee();
        this.serviceFee = payment.getServiceFee();
        this.roomTax = payment.getRoomTax();
    }

    public static PaymentDetailsDto from(Payment paymentDetail) {
        return new PaymentDetailsDto(paymentDetail);
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
