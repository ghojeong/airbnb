package com.airbnb.domain.mainpage.search;

public class SearchInputComponents {

    private final Location location;

    public SearchInputComponents(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
