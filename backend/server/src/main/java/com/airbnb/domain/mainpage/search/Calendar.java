package com.airbnb.domain.mainpage.search;

public class Calendar {

    private final String[] title;
    private final String placeholderText;

    public Calendar(String[] title, String placeholderText) {
        this.title = title;
        this.placeholderText = placeholderText;
    }

    public String[] getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }
}
