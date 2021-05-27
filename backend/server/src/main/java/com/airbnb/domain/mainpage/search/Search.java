package com.airbnb.domain.mainpage.search;

public class Search {
    private final SearchInputComponents searchInputComponents;
    private final Calendar calendar;
    private final Price price;
    private final Guests guests;

    public Search(SearchInputComponents searchInputComponents, Calendar calendar, Price price, Guests guests) {
        this.searchInputComponents = searchInputComponents;
        this.calendar = calendar;
        this.price = price;
        this.guests = guests;
    }

    public SearchInputComponents getSearchInputComponents() {
        return searchInputComponents;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public Price getPrice() {
        return price;
    }

    public Guests getGuests() {
        return guests;
    }
}
