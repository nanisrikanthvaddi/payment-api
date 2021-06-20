package com.open.payment.acc.api.entity;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Data
@Entity
@Table(name="payment_child_transcation")
public class PaymentChildTransactions {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="payment_child_transcation_sequence")
    @SequenceGenerator(name = "payment_child_transcation_sequence" , sequenceName =  "payment_child_transcation_sequence",allocationSize = 1)
    private Long paymentChildId;

    private String  paymentAmount;
    private String  paymentStatus;
    private String beneficiaryName;

    private String accountNumber;

    private String accountType;

    private String mobileNumber;

    private String countryCode;

    private String bankName;

    private String bankBranch;

    private String bankBranchCode;
    private String swiftCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="txnId", referencedColumnName="txnId", insertable=true)
    private PaymentTxn txnId;
    
}

