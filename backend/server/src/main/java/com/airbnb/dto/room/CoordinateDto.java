package com.airbnb.dto.room;

import com.airbnb.domain.room.Coordinate;

public class CoordinateDto {
    private final Float latitude;
    private final Float longitude;

    public CoordinateDto(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private CoordinateDto(Coordinate coordinate) {
        this.latitude = coordinate.getLatitude();
        this.longitude = coordinate.getLongitude();
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public static CoordinateDto from(Coordinate coordinate) {
        return new CoordinateDto(coordinate);
    }
}
