package com.example.springcore_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // private field for dependency injection
    private Coach myCoach;

    // Constructor for dependency injection
    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }
    // Endpoint to get the daily workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        // Use the injected Coach instance to get the daily workout
        return myCoach.getDailyWorkout();
    }

}
