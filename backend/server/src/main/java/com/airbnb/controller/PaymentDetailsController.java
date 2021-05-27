package com.airbnb.controller;

import com.airbnb.dto.payment.PaymentDetailsDto;
import com.airbnb.dto.payment.PaymentDetailsRequest;
import com.airbnb.service.PaymentDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentDetailsController {
    private final PaymentDetailsService paymentDetailsService;

    public PaymentDetailsController(PaymentDetailsService paymentDetailsService) {
        this.paymentDetailsService = paymentDetailsService;
    }

    @GetMapping("/popup")
    public PaymentDetailsDto getPayment(PaymentDetailsRequest paymentDetailsRequest) {
        System.out.println("paymentDetailsRequest.getCheckOut() = " + paymentDetailsRequest.getCheckOut());
        System.out.println("paymentDetailsRequest.getCheckIn() = " + paymentDetailsRequest.getCheckIn());
        return paymentDetailsService.getPaymentDetailsDto(paymentDetailsRequest);
    }
}
