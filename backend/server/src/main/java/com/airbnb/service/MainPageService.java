package com.airbnb.service;

import com.airbnb.dto.mainpage.MainPageResponse;
import com.airbnb.repository.MainPageRepository;
import org.springframework.stereotype.Service;

@Service
public class MainPageService {
    private final MainPageRepository mainPageRepository;


    public MainPageService(MainPageRepository mainPageRepository) {
        this.mainPageRepository = mainPageRepository;
    }

    public MainPageResponse getMainPage() {
        return MainPageResponse.from(mainPageRepository.getMainPage());
    }

}
