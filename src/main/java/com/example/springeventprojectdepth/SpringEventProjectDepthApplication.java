package com.example.springeventprojectdepth;

import com.example.springeventprojectdepth.publisher.GooglePay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEventProjectDepthApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringEventProjectDepthApplication.class, args);
        GooglePay googlePay = context.getBean(GooglePay.class);
        googlePay.sendMoney("Ali Durmaz",1000.00,true);
        ;
    }

}
