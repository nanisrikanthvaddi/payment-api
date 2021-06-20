package com.open.payment.acc.api.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.open.payment.acc.api.model.PaymentRequest;
import com.open.payment.acc.api.service.PaymentService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Singleton;
import javax.validation.Valid;


@Singleton
@Component
@RestController
public class PaymentController implements PaymentApi {

    @Autowired
    PaymentService service;

    @Override
    @PostMapping("/payment")
    public  ResponseEntity<Void> createPayment(@ApiParam(value = "Created payment request" ,required=true )  @Valid @RequestBody PaymentRequest paymentRequest) throws JsonProcessingException {
        System.out.println(paymentRequest+"payment processed successfully");
        service.processPayment(paymentRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }



}
