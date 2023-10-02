package com.payment.repository;

import com.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositpry extends JpaRepository<Payment, IncompatibleClassChangeError> {
}
