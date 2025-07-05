package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    // Injecting values from application.properties
    @Value("${project.description}")
    private String projectDescription;

    @Value("${location.country}")
    private String country;

    // Default constructor
    @GetMapping("/")
    public String sayHello() {
        System.out.println("Hello from the REST controller!");
        String html = "<h1> Project description : " + projectDescription + "</h1>";
        return html;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/country")
    public String getCountry() {
        return "Country: " + country;
    }

}
