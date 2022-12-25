package com.example.springeventprojectdepth.listener;

import com.example.springeventprojectdepth.events.TransactionFailureEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SendSMSListener  {

    @Order(1)
    @EventListener
    public void start(TransactionFailureEvent event) {
         System.out.println("Hi " + event.getUsername());
         System.out.println("Sending an SMS with body "
                            + "Hi " + event.getUsername() + " Transaction failed for the amount "
                            + event.getAmount());
    }

}
