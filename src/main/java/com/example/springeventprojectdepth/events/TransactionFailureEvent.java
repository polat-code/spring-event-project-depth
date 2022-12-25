package com.example.springeventprojectdepth.events;

import org.springframework.context.ApplicationEvent;

public class TransactionFailureEvent {

    private String username;
    private double amount;

    public TransactionFailureEvent(String name, double amount) {
        this.username = name;
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public double getAmount() {
        return amount;
    }
}
