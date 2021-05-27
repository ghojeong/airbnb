package com.airbnb.domain.mainpage.search;

public class Price {
    private final String title;
    private final String placeholderText;
    private final String modalTitle;
    private final String[] modalText;

    public Price(String title, String placeholderText, String modalTitle, String[] modalText) {
        this.title = title;
        this.placeholderText = placeholderText;
        this.modalTitle = modalTitle;
        this.modalText = modalText;
    }

    public String getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }

    public String getModalTitle() {
        return modalTitle;
    }

    public String[] getModalText() {
        return modalText;
    }
}
