package com.payment.service;

import com.payment.entity.Payment;

public interface PaymentService {

    Payment doPayment(Payment payment);

    String paymentProcessing();
}
