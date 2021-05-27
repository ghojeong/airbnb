package com.airbnb.domain.mainpage.search;

public class Location {
    private final String title;
    private final String placeholderText;
    private final String[] modalLocationList;
    private final Boolean requiredInput;

    public Location(String title, String placeholderText, String[] modalLocationList, Boolean requiredInput) {
        this.title = title;
        this.placeholderText = placeholderText;
        this.modalLocationList = modalLocationList;
        this.requiredInput = requiredInput;
    }

    public String getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }

    public String[] getModalLocationList() {
        return modalLocationList;
    }

    public Boolean getRequiredInput() {
        return requiredInput;
    }
}
