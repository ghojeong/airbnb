package com.airbnb.service;

import com.airbnb.dto.payment.PaymentDetailsDto;
import com.airbnb.dto.payment.PaymentDetailsRequest;
import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.dto.room.SearchRequest;
import com.airbnb.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public RoomListResponse getRoomList(SearchRequest searchRequest) {
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

}
