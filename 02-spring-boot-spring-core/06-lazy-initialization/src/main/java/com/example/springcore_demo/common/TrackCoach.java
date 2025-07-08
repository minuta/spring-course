package com.example.springcore_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // Add any additional methods or properties specific to TrackCoach here
}
