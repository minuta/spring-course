package com.example.springcore_demo.rest;

import com.example.springcore_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This is a Spring Boot REST controller that demonstrates Singleton scope
@RestController
public class DemoController {

    // private field for dependency injection
    private Coach myCoach;
    private Coach anotherCoach;

    // Constructor-based dependency injection
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach myCoach,
                               @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("--- in constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    // Endpoint to get the daily workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        // Use the injected Coach instance to get the daily workout
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkBeans")
    public String checkBeans() {
        // Check if the two Coach instances are the same
        return "Comparing Beans myCoach == anotherCoach? " + (myCoach == anotherCoach);
    }
}
