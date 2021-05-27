package com.airbnb.service;

import com.airbnb.dto.payment.PaymentDetailsDto;
import com.airbnb.dto.payment.PaymentDetailsRequest;
import com.airbnb.repository.PaymentDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentDetailsService {
    private final PaymentDetailsRepository paymentDetailsRepository;

    public PaymentDetailsService(PaymentDetailsRepository paymentDetailsRepository) {
        this.paymentDetailsRepository = paymentDetailsRepository;
    }

    public PaymentDetailsDto getPaymentDetailsDto(PaymentDetailsRequest paymentDetailsRequest) {
        return PaymentDetailsDto.from(paymentDetailsRepository.getPaymentDetail());
    }
}
