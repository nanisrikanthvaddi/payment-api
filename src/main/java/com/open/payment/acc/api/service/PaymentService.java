package com.open.payment.acc.api.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.open.payment.acc.api.config.PaymentMapper;
import com.open.payment.acc.api.entity.PaymentTxn;
import com.open.payment.acc.api.model.PaymentRequest;
import com.open.payment.acc.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class PaymentService {


    @Autowired
    PaymentRepository payRepo;
    @Autowired
    PaymentMapper paymentMapper;

    @Autowired
    ObjectMapper mapper;
    @Autowired
    KafkaTemplate<String,String> template;

    @Value("${payment-topic}")
    private  String paymentTopic;


    @Transactional
    public void processPayment(PaymentRequest request) throws JsonProcessingException {
        PaymentTxn txn=paymentMapper.map(request, PaymentTxn.class);
       //  txn.getChildTransactions().stream().forEach(a->  a.setPaymentId(txn));
        payRepo.save(txn);
        sendtoKafka(txn);
        System.out.println(txn);

    }


   public void  sendtoKafka(PaymentTxn txn) throws JsonProcessingException {
        try{
            String paymentRequest= mapper.writeValueAsString(txn);
            template.send(paymentTopic,paymentRequest);
        }catch( JsonProcessingException e){
            throw e;
       }


    }
}
