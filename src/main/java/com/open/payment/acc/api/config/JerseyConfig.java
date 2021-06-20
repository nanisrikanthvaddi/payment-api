package com.open.payment.acc.api.config;

import com.open.payment.acc.api.controller.PaymentController;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

import static com.open.payment.acc.api.config.SwaggerConfig.initSwagger;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register(PaymentController.class);

        register(JacksonJaxbJsonProvider.class);
        initSwagger(
                "API Banking - Open API Scheme", "Account Services",
                "API Banking Support Team",
                "Company Licence - http://www.accenture.com/licenses.html",
                "https://www.accenture.com/terms-and-conditions",
                "Payment API",
                "api",
                "",
                this);

    }

}
