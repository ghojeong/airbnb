package com.airbnb.dto.mainpage.search;


import com.airbnb.domain.mainpage.search.Search;

public class SearchDto {

    private final SearchInputComponentsDto searchInputComponents;
    private final CalendarDto calendar;
    private final PriceDto price;
    private final GuestsDto guests;

    public SearchDto(SearchInputComponentsDto searchInputComponents, CalendarDto calendar, PriceDto price, GuestsDto guests) {
        this.searchInputComponents = searchInputComponents;
        this.calendar = calendar;
        this.price = price;
        this.guests = guests;
    }

    private SearchDto(Search search) {
        this.searchInputComponents = SearchInputComponentsDto.from(search.getSearchInputComponents());
        this.calendar = CalendarDto.from(search.getCalendar());
        this.price = PriceDto.from(search.getPrice());
        this.guests = GuestsDto.from(search.getGuests());
    }

    public SearchInputComponentsDto getSearchInputComponents() {
        return searchInputComponents;
    }

    public CalendarDto getCalendar() {
        return calendar;
    }

    public PriceDto getPrice() {
        return price;
    }

    public GuestsDto getGuests() {
        return guests;
    }

    public static SearchDto from(Search search) {
        return new SearchDto(search);
    }
}
