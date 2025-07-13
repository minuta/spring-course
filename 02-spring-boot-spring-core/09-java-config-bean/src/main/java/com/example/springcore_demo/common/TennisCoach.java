package com.example.springcore_demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("--- in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley for 30 minutes!";
    }

    // Add any additional methods or properties specific to TennisCoach here
}
