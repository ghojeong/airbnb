package com.airbnb.dto.mainpage.navigation;

import com.airbnb.domain.mainpage.navigation.Navigation;

public class NavigationDto {
    private final String[] titles;

    public NavigationDto(String[] title) {
        this.titles = title;
    }

    private NavigationDto(Navigation navigation) {
        this.titles = navigation.getTitles();
    }

    public String[] getTitles() {
        return titles;
    }

    public static NavigationDto from(Navigation navigation) {
        return new NavigationDto(navigation);
    }
}
