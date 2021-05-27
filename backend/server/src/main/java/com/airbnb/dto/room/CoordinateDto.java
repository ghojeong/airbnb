package com.airbnb.dto.room;

import com.airbnb.domain.room.Coordinate;

public class CoordinateDto {
    private final float latitude;
    private final float longitude;

    public CoordinateDto(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private CoordinateDto(Coordinate coordinate) {
        this.latitude = coordinate.getLatitude();
        this.longitude = coordinate.getLongitude();
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public static CoordinateDto from(Coordinate coordinate) {
        return new CoordinateDto(coordinate);
    }
}
