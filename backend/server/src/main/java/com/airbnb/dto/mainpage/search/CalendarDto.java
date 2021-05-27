package com.airbnb.dto.mainpage.search;

import com.airbnb.domain.mainpage.search.Calendar;

public class CalendarDto {

    private final String[] title;
    private final String placeholderText;

    public CalendarDto(String[] title, String placeholderText) {
        this.title = title;
        this.placeholderText = placeholderText;
    }

    private CalendarDto(Calendar calendar) {
        this.title = calendar.getTitle();
        this.placeholderText = calendar.getPlaceholderText();
    }

    public String[] getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }

    public static CalendarDto from(Calendar calendar) {
        return new CalendarDto(calendar);
    }
}
