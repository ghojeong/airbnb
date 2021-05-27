package com.airbnb.domain.mainpage.search;

public class Guests {
    private final String title;
    private final String placeholderText;

    public Guests(String title, String placeholderText) {
        this.title = title;
        this.placeholderText = placeholderText;
    }

    public String getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }
}
