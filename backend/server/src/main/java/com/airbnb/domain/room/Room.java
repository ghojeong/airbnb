package com.airbnb.domain.room;

public class Room {
    private final Long id;
    private final String thumImage;
    private final String roomType;
    private final String roomName;
    private final String roomLabel;
    private final String publicAddress;
    private final Integer personCapacity;
    private final float starRating;
    private final String reviewLabel;
    private final float price;
    private final float totalPrice;
    private final Coordinate coordinate;
    private final Payment payment;

    public Room(Long id, String thumImage, String roomType, String roomName, String roomLabel, String publicAddress, Integer personCapacity, float starRating, String reviewLabel, float price, float totalPrice, Coordinate coordinate, Payment payment) {
        this.id = id;
        this.thumImage = thumImage;
        this.roomType = roomType;
        this.roomName = roomName;
        this.roomLabel = roomLabel;
        this.publicAddress = publicAddress;
        this.personCapacity = personCapacity;
        this.starRating = starRating;
        this.reviewLabel = reviewLabel;
        this.price = price;
        this.totalPrice = totalPrice;
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

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Payment getPayment() {
        return payment;
    }
}
