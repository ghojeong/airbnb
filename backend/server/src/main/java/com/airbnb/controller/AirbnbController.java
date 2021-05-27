package com.airbnb.controller;

import com.airbnb.dto.mainpage.MainPageResponse;
import com.airbnb.dto.payment.PaymentDetailsDto;
import com.airbnb.dto.room.RoomListResponse;
import com.airbnb.service.AirbnbService;
import com.airbnb.service.PaymentDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AirbnbController {
    private final AirbnbService airbnbService;
    private final PaymentDetailsService paymentDetailsService;

    public AirbnbController(AirbnbService airbnbService, PaymentDetailsService paymentDetailsService) {
        this.airbnbService = airbnbService;
        this.paymentDetailsService = paymentDetailsService;
    }

    @GetMapping("/mainPage")
    public MainPageResponse getMainPage() {
        return airbnbService.getMainPage();
    }

    @GetMapping("/search")
    public RoomListResponse getRoomList() {
        return airbnbService.getRoomList();
    }

    @GetMapping("/popup")
    public PaymentDetailsDto getPayment() {
        return paymentDetailsService.getPaymentDetailsDto();
    }
}
