package com.airbnb.domain.mainpage;

import com.airbnb.domain.mainpage.navigation.Navigation;
import com.airbnb.domain.mainpage.search.Search;

public class MainPage {
    private final Navigation navigation;
    private final Search search;

    public MainPage(Navigation navigation, Search search) {
        this.navigation = navigation;
        this.search = search;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public Search getSearch() {
        return search;
    }
}
