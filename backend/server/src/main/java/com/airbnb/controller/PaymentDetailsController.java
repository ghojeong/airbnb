package com.airbnb.controller;

import com.airbnb.dto.payment.PaymentDetailsDto;
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
    public PaymentDetailsDto getPayment() {
        return paymentDetailsService.getPaymentDetailsDto();
    }
}
