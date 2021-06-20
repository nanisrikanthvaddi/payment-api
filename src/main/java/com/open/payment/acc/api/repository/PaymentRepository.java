package com.open.payment.acc.api.repository;

import com.open.payment.acc.api.entity.PaymentTxn;
 import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<PaymentTxn, Long > {
}
