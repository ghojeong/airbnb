package com.airbnb.controller;

import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.service.RoomListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoomListController {
    private final RoomListService roomListService;

    public RoomListController(RoomListService roomListService) {
        this.roomListService = roomListService;
    }

    @GetMapping("/search")
    public RoomListResponse getRoomList() {
        return roomListService.getRoomList();
    }
}
