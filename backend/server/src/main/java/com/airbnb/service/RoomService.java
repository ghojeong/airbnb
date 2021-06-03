package com.airbnb.service;

import com.airbnb.domain.room.Room;
import com.airbnb.dto.payment.PaymentDetailsDto;
import com.airbnb.dto.payment.PaymentDetailsRequest;
import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.dto.room.SearchRequest;
import com.airbnb.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
    private final ReservationService reservationService;

    public RoomService(RoomRepository roomRepository, ReservationService reservationService) {
        this.roomRepository = roomRepository;
        this.reservationService = reservationService;
    }

    public RoomListResponse getRoomList(SearchRequest searchRequest) {

        List<Room> rooms = roomRepository.getRoomList(searchRequest.getCheckIn(),
                searchRequest.getCheckOut(),
                searchRequest.getPriceMin(),
                searchRequest.getPriceMax());
        List<Room> roomsByPeriod = roomRepository.getRoomList(searchRequest.getCheckIn(), searchRequest.getCheckOut(), searchRequest.getPriceMin(), searchRequest.getPriceMax());


        return RoomListResponse.from(roomRepository.getRoomList(
                searchRequest.getCheckIn(),
                searchRequest.getCheckOut(),
                searchRequest.getPriceMin(),
                searchRequest.getPriceMax()
        ));
    }

    public PaymentDetailsDto getPaymentDetailsDto(PaymentDetailsRequest paymentDetailsRequest) {
        return PaymentDetailsDto.from(roomRepository.getPaymentDetail(
                paymentDetailsRequest.getRoomId(),
                paymentDetailsRequest.getCheckIn(),
                paymentDetailsRequest.getCheckOut(),
                paymentDetailsRequest.getAdults())
        );
    }

    public List<Integer> getRoomPrice() {
        return roomRepository.getRoomPrices();
    }
}
