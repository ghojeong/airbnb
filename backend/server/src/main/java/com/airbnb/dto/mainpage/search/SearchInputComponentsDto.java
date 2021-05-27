package com.airbnb.dto.mainpage.search;

import com.airbnb.domain.mainpage.search.SearchInputComponents;

public class SearchInputComponentsDto {

    private final LocationDto location;

    private SearchInputComponentsDto(SearchInputComponents searchInputComponents) {
        this.location = LocationDto.from(searchInputComponents.getLocation());
    }

    public LocationDto getLocation() {
        return location;
    }

    public static SearchInputComponentsDto from(SearchInputComponents searchInputComponents) {
        return new SearchInputComponentsDto(searchInputComponents);
    }
}
