package com.payment.service;

import com.payment.entity.Payment;
import com.payment.repository.PaymentRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentServiceImp implements PaymentService{

    @Autowired
    PaymentRepositpry paymentRepositpry;

    @Override
    public Payment doPayment(Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(paymentProcessing());
        return paymentRepositpry.save(payment);
    }

    @Override
    public String paymentProcessing(){

        return  new Random().nextBoolean()?"success":"false";
    }
}
