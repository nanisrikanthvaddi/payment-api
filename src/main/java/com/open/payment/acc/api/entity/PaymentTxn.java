package com.open.payment.acc.api.entity;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Slf4j
@Data
@Entity
@Table(name = "payment")
public class PaymentTxn {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="payment_sequence")
    @SequenceGenerator(name = "payment_sequence" , sequenceName =  "payment_sequence",allocationSize = 1)
    private Long txnId;

    private Long paymentId;

    private String clientId;

    private String clientName;

    private String b2bId;

    private String gstNo;

    private String debitAccountNumber;

    private String paymentType;

    @OneToMany( cascade = {CascadeType.ALL,CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinColumn(name="txnId")
    private List<PaymentChildTransactions> childTransactions;

}

