package com.airbnb.service;

import com.airbnb.dto.mainpage.MainPageResponse;
import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.repository.MainPageRepository;
import com.airbnb.repository.RoomListRepository;
import org.springframework.stereotype.Service;

@Service
public class AirbnbService {
    private final MainPageRepository mainPageRepository;
    private final RoomListRepository roomListRepository;

    public AirbnbService(MainPageRepository mainPageRepository, RoomListRepository roomListRepository) {
        this.mainPageRepository = mainPageRepository;
        this.roomListRepository = roomListRepository;
    }

    public MainPageResponse getMainPage() {
        return MainPageResponse.from(mainPageRepository.getMainPage());
    }

    public RoomListResponse getRoomList() {
        return RoomListResponse.from(roomListRepository.getRoomList());
    }
}
