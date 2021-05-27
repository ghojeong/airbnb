package com.airbnb.dto.room;

import com.airbnb.domain.roomlist.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomListResponse {
    private final List<RoomDto> roomDtoList = new ArrayList<>();

    private RoomListResponse(List<Room> roomList) {
        for (Room room : roomList) {
            roomDtoList.add(RoomDto.from(room));
        }
    }

    public static RoomListResponse from(List<Room> roomList) {
        return new RoomListResponse(roomList);
    }

    public List<RoomDto> getRoomDtoList() {
        return roomDtoList;
    }
}
