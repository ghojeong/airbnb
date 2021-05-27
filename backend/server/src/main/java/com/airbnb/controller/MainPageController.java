package com.airbnb.controller;

import com.airbnb.dto.mainpage.MainPageResponse;
import com.airbnb.service.MainPageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainPageController {
    private final MainPageService mainPageService;

    public MainPageController(MainPageService mainPageService) {
        this.mainPageService = mainPageService;
    }

    @GetMapping("/mainPage")
    public MainPageResponse getMainPage() {
        return mainPageService.getMainPage();
    }

}
