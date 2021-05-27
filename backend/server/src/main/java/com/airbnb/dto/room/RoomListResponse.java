package com.airbnb.dto.room;

import com.airbnb.domain.room.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomListResponse {
    private final List<RoomDto> roomList = new ArrayList<>();

    private RoomListResponse(List<Room> roomList) {
        for (Room room : roomList) {
            this.roomList.add(RoomDto.from(room));
        }
    }

    public static RoomListResponse from(List<Room> roomList) {
        return new RoomListResponse(roomList);
    }

    public List<RoomDto> getRoomList() {
        return roomList;
    }
}
