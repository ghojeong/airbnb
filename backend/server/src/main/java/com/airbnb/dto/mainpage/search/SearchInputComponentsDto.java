package com.airbnb.dto.mainpage.search;

import com.airbnb.domain.mainpage.search.SearchInputComponents;

public class SearchInputComponentsDto {

    private final LocationDto locationDto;

    private SearchInputComponentsDto(SearchInputComponents searchInputComponents) {
        this.locationDto = LocationDto.from(searchInputComponents.getLocation());
    }

    public LocationDto getLocationDto() {
        return locationDto;
    }

    public static SearchInputComponentsDto from(SearchInputComponents searchInputComponents) {
        return new SearchInputComponentsDto(searchInputComponents);
    }
}
