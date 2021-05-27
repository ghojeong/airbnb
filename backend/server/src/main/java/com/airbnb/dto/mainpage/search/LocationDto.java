package com.airbnb.dto.mainpage.search;

import com.airbnb.domain.mainpage.search.Location;

public class LocationDto {
    /**
     * "location": {
     * "title": "위치",
     * "placeholder_text": "어디로 여행가세요?",
     * "modal_location_list": ["강남구", "종로구", "강동구", "마포구", "가까운 여행지 둘러보기"],
     * "required_input": true
     * },
     */
    private final String title;
    private final String placeholderText;
    private final String[] modalLocationList;
    private final Boolean requiredInput;

    public LocationDto(String title, String placeholderText, String[] modalLocationList, Boolean requiredInput) {
        this.title = title;
        this.placeholderText = placeholderText;
        this.modalLocationList = modalLocationList;
        this.requiredInput = requiredInput;
    }

    private LocationDto(Location location) {
        this.title = location.getTitle();
        this.placeholderText = location.getPlaceholderText();
        this.modalLocationList = location.getModalLocationList();
        this.requiredInput = location.getRequiredInput();
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

    public static LocationDto from(Location location) {
        return new LocationDto(location);
    }
}
