package com.open.payment.acc.api.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

   @Value("${payment-topic}")
   private  String paymentTopic;

   /* @Bean
    public NewTopic topic(){

       return TopicBuilder.name(paymentTopic).partitions(1).replicas(1).build();
    }*/
}
