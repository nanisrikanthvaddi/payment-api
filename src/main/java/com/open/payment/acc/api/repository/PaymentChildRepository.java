package com.open.payment.acc.api.repository;

import com.open.payment.acc.api.entity.PaymentChildTransactions;
import com.open.payment.acc.api.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentChildRepository extends JpaRepository<PaymentChildTransactions ,Long > {
}
