package com.airbnb.domain.roomlist;

public class Coordinate {
    private final float latitude;
    private final float longitude;

    public Coordinate(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
