package com.airbnb.dto.mainpage.search;

import com.airbnb.domain.mainpage.search.Guests;

public class GuestsDto {
    /**
     * "guests": {
     * "title": "인원",
     * "placeholder_text": "게스트 추가"
     * }
     */
    private final String title;
    private final String placeholderText;

    public GuestsDto(String title, String placeholderText) {
        this.title = title;
        this.placeholderText = placeholderText;
    }

    private GuestsDto(Guests guests) {
        this.title = guests.getTitle();
        this.placeholderText = guests.getPlaceholderText();
    }

    public String getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }

    public static GuestsDto from(Guests guests) {
        return new GuestsDto(guests);
    }
}
