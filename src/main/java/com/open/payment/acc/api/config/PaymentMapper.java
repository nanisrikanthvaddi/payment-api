package com.open.payment.acc.api.config;

import com.open.payment.acc.api.entity.PaymentChildTransactions;
import com.open.payment.acc.api.entity.PaymentTxn;
import com.open.payment.acc.api.model.Payment;
import com.open.payment.acc.api.model.PaymentRequest;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper extends ConfigurableMapper {

    protected void configure(MapperFactory factory) {

        factory.classMap(PaymentRequest.class, PaymentTxn.class)
                .field("paymentInstructionsList","childTransactions")
                 .byDefault()
                .register();

        factory.classMap(Payment.class, PaymentChildTransactions.class)

                .field("paymentAmount","paymentAmount")
                .field("paymentStatus", "paymentStatus")
                .field("account.accountNumber","accountNumber")
                .field("account.beneficiaryName","beneficiaryName")

                .field("account.accountType","accountType")
                .field("account.mobileNumber","mobileNumber")
                .field("account.countryCode","countryCode")
                .field("account.bankName","bankName")
                .field("account.bankBranch","bankBranch")
                .field("account.bankBranchCode","bankBranchCode")
                .field("account.swiftCode","swiftCode")
                .byDefault()
                .register();
    }

}
