package com.airbnb.dto.room;

import com.airbnb.domain.room.Room;

public class RoomDto {
    private final Long id;
    private final String thumImage;
    private final String roomType;
    private final String roomName;
    private final String roomLabel;
    private final CoordinateDto coordinate;
    private final String publicAddress;
    private final Integer personCapacity;
    private final float starRating;
    private final String reviewLabel;
    private final float price;
    private final float totalPrice;

    private RoomDto(Room room) {
        this.id = room.getId();
        this.thumImage = room.getThumImage();
        this.roomType = room.getRoomType();
        this.roomName = room.getRoomName();
        this.roomLabel = room.getRoomLabel();
        this.coordinate = CoordinateDto.from(room.getCoordinate());
        this.publicAddress = room.getPublicAddress();
        this.personCapacity = room.getPersonCapacity();
        this.starRating = room.getStarRating();
        this.reviewLabel = room.getReviewLabel();
        this.price = room.getPrice();
        this.totalPrice = room.getTotalPrice();
    }

    public static RoomDto from(Room room) {
        return new RoomDto(room);
    }


    public Long getId() {
        return id;
    }

    public String getThumImage() {
        return thumImage;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomLabel() {
        return roomLabel;
    }

    public CoordinateDto getCoordinate() {
        return coordinate;
    }

    public String getPublicAddress() {
        return publicAddress;
    }

    public Integer getPersonCapacity() {
        return personCapacity;
    }

    public float getStarRating() {
        return starRating;
    }

    public String getReviewLabel() {
        return reviewLabel;
    }

    public float getPrice() {
        return price;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

}
