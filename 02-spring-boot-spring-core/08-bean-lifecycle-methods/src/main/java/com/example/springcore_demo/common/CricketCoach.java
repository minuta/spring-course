package com.example.springcore_demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// This class implements the Coach interface and provides a specific implementation for cricket coaching.
// Per default, this class will be a singleton bean in the Spring context.
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("--- in constructor: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("in doMyStartupStuff() : " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("in doMyCleanupStuff() : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

    // Add any additional methods or properties specific to CricketCoach here
}
