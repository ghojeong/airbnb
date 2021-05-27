package com.airbnb.controller;

import com.airbnb.dto.mainpage.search.SearchRequest;
import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public RoomListResponse getRoomList(SearchRequest searchRequest) {
        return roomService.getRoomList(searchRequest);
    }
}
