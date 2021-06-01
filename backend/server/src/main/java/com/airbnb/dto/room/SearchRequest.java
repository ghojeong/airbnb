package com.airbnb.dto.room;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRequest {
    @JsonProperty
    private String checkIn;
    private String checkOut;
    private int priceMin;
    private int priceMax;

    public String getCheckIn() {
        return checkIn;
    }

    public SearchRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public SearchRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }

    public int getPriceMin() {
        return priceMin;
    }

    public SearchRequest setPriceMin(int priceMin) {
        this.priceMin = priceMin;
        return this;
    }

    public int getPriceMax() {
        return priceMax;
    }

    public SearchRequest setPriceMax(int priceMax) {
        this.priceMax = priceMax;
        return this;
    }
}
