package com.airbnb.domain.room;

public class Room {
    private final Long id;
    private final String thumImage;
    private final String roomType;
    private final String roomName;
    private final String roomLabel;
    private final String publicAddress;
    private final Integer personCapacity;
    private final Float starRating;
    private final String reviewLabel;
    private final Coordinate coordinate;
    private final Payment payment;

    public Room(Long id, String thumImage, String roomType, String roomName, String roomLabel, String publicAddress, Integer personCapacity, float starRating, String reviewLabel, Coordinate coordinate, Payment payment) {
        this.id = id;
        this.thumImage = thumImage;
        this.roomType = roomType;
        this.roomName = roomName;
        this.roomLabel = roomLabel;
        this.publicAddress = publicAddress;
        this.personCapacity = personCapacity;
        this.starRating = starRating;
        this.reviewLabel = reviewLabel;
        this.coordinate = coordinate;
        this.payment = payment;
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

    public String getPublicAddress() {
        return publicAddress;
    }

    public Integer getPersonCapacity() {
        return personCapacity;
    }

    public Float getStarRating() {
        return starRating;
    }

    public String getReviewLabel() {
        return reviewLabel;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Payment getPayment() {
        return payment;
    }
}
