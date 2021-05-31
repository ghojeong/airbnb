package com.airbnb.controller;

import com.airbnb.dto.reservation.ReservationRequest;
import com.airbnb.service.ReservationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/reservation")
    public void reservation(ReservationRequest reservation) {
        reservationService.save(reservation);
    }
}
