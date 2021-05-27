package com.airbnb.dto.mainpage;

import com.airbnb.domain.mainpage.MainPage;
import com.airbnb.dto.mainpage.navigation.NavigationDto;
import com.airbnb.dto.mainpage.search.SearchDto;

public class MainPageResponse {
    private final NavigationDto navigation;
    private final SearchDto search;

    public MainPageResponse(NavigationDto navigation, SearchDto search) {
        this.navigation = navigation;
        this.search = search;
    }

    private MainPageResponse(MainPage mainPage) {
        this.navigation = NavigationDto.from(mainPage.getNavigation());
        this.search = SearchDto.from(mainPage.getSearch());
    }

    public NavigationDto getNavigation() {
        return navigation;
    }

    public SearchDto getSearch() {
        return search;
    }

    public static MainPageResponse from(MainPage mainPage) {
        return new MainPageResponse(mainPage);
    }
}
