package com.airbnb.dto.room;

public class SearchRequest {

    private String checkIn;
    private String checkOut;
    private int priceMin;
    private int priceMax;

    public SearchRequest(String checkIn, String checkOut, int priceMin, int priceMax) {
        this.checkIn =  checkIn;
        this.checkOut = checkOut;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public int getPriceMin() {
        return priceMin;
    }

    public int getPriceMax() {
        return priceMax;
    }
}
