package com.airbnb.dto.mainpage.search;

import com.airbnb.domain.mainpage.search.Price;

public class PriceDto {
    /**
     * "price": {
     * "title": "요금",
     * "placeholder_text": "금액대 설정",
     * "modal_title": "가격 범위",
     * "modal_text": ["평균 1박 요금은", "입니다."]
     */
    private final String title;
    private final String placeholderText;
    private final String modalTitle;
    private final String[] modalText;

    public PriceDto(String title, String placeholderText, String modalTitle, String[] modalText) {
        this.title = title;
        this.placeholderText = placeholderText;
        this.modalTitle = modalTitle;
        this.modalText = modalText;
    }

    private PriceDto(Price price) {
        this.title = price.getTitle();
        this.placeholderText = price.getPlaceholderText();
        this.modalTitle = price.getModalTitle();
        this.modalText = price.getModalText();
    }

    public String getTitle() {
        return title;
    }

    public String getPlaceholderText() {
        return placeholderText;
    }

    public String getModalTitle() {
        return modalTitle;
    }

    public String[] getModalText() {
        return modalText;
    }

    public static PriceDto from(Price price) {
        return new PriceDto(price);
    }
}
