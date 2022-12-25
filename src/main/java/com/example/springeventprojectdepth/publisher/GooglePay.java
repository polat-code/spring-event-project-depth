package com.example.springeventprojectdepth.publisher;

import com.example.springeventprojectdepth.events.TransactionFailureEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GooglePay {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMoney(String name , double amount,boolean condition) {
        try {
            if (condition) {
                throw new RuntimeException("Transaction is failed!");
            }

            System.out.println("Hi " + name);
            System.out.println("sending amount " + amount + " is successfully!");

        }catch (Exception e) {
            applicationEventPublisher.publishEvent(new TransactionFailureEvent(name , amount));
            e.printStackTrace();
        }
    }
}
