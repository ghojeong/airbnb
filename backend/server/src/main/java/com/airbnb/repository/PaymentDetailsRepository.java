package com.airbnb.repository;

import com.airbnb.domain.payment.PaymentDetails;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDetailsRepository {
    public PaymentDetails getPaymentDetail() {
        return new PaymentDetails(130000, 0.96f, 20000, 10000, 1.05f);
    }
}
