package com.example.springcore_demo.rest;

import com.example.springcore_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // private field for dependency injection
    private Coach myCoach;

    // Constructor-based dependency injection
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    // Endpoint to get the daily workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        // Use the injected Coach instance to get the daily workout
        return myCoach.getDailyWorkout();
    }

}
