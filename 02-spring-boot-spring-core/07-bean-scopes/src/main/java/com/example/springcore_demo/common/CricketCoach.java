package com.example.springcore_demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// This class implements the Coach interface and provides a specific implementation for cricket coaching.
// Per default, this class will be a singleton bean in the Spring context.
// Here we demonstrate the use of @Scope to set it to prototype scope, meaning a new instance will be
// created each time it is requested.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("--- in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

    // Add any additional methods or properties specific to CricketCoach here
}
