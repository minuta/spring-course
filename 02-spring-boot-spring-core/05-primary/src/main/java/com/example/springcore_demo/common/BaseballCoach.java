package com.example.springcore_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice!";
    }

    // Add any additional methods or properties specific to BaseballCoach here
}
