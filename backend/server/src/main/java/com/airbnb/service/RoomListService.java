package com.airbnb.service;

import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.repository.RoomListRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomListService {
    private final RoomListRepository roomListRepository;

    public RoomListService(RoomListRepository roomListRepository) {
        this.roomListRepository = roomListRepository;
    }
    public RoomListResponse getRoomList() {
        return RoomListResponse.from(roomListRepository.getRoomList());
    }

}
