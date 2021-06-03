package com.airbnb.controller;

import com.airbnb.dto.payment.PaymentDetailsDto;
import com.airbnb.dto.payment.PaymentDetailsRequest;
import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.dto.room.SearchRequest;
import com.airbnb.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/payments")
    public PaymentDetailsDto getPayment(PaymentDetailsRequest paymentDetailsRequest) {
        return roomService.getPaymentDetailsDto(paymentDetailsRequest);
    }

    @GetMapping("/graph")
    public List<Integer> getPriceGraph() {
        return roomService.getRoomPrice();
    }
}
