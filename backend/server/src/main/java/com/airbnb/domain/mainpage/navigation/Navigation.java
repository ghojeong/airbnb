package com.airbnb.domain.mainpage.navigation;

public class Navigation {
    private final String[] titles;

    public Navigation(String[] titles) {
        this.titles = titles;
    }

    public String[] getTitles() {
        return titles;
    }
}
