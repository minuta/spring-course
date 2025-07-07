package com.example.springcore_demo.common;

import org.springframework.stereotype.Component;

// This class implements the Coach interface and provides a specific implementation for cricket coaching.
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

    // Add any additional methods or properties specific to CricketCoach here
}
