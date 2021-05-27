package com.airbnb.service;

import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public RoomListResponse getRoomList() {
        return RoomListResponse.from(roomRepository.getRoomList());
    }

}
