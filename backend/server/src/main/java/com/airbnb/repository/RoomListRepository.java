package com.airbnb.repository;

import com.airbnb.domain.roomlist.Coordinate;
import com.airbnb.domain.roomlist.Room;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RoomListRepository {
    public List<Room> getRoomList() {

        List<Room> roomList = new ArrayList<>();

        roomList.add(new Room(123L, "썸네일 이미지", "서초구의 아파트 전체", "Spacious and Comfortable Cozy house #4",
                "최대 인원 3명*원룸, 침대 1개, 욕실 1개*주방, 무선인터넷, 에어컨, 헤어드라이어",
                new Coordinate(37.4909f, 127.0328f),
                "Yeoksam 1(il)-dong, Gangnam-gu, 서울, 한국",
                3,
                4.80f,
                "후기 127개",
                82953,
                128136
        ));

        roomList.add(new Room(123L, "썸네일 이미지", "서초구의 아파트 전체", "Spacious and Comfortable Cozy house #4",
                "최대 인원 3명*원룸, 침대 1개, 욕실 1개*주방, 무선인터넷, 에어컨, 헤어드라이어",
                new Coordinate(37.4909f, 127.0328f),
                "Yeoksam 1(il)-dong, Gangnam-gu, 서울, 한국",
                3,
                4.80f,
                "후기 127개",
                82953,
                128136
        ));

        return roomList;
    }
}
