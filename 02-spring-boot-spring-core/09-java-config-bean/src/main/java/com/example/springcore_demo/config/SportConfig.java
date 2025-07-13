package com.example.springcore_demo.config;

import com.example.springcore_demo.common.Coach;
import com.example.springcore_demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    // This class is used to define Spring beans and configurations for the application.
    // You can add bean definitions here if needed, using @Bean annotations.

    @Bean
    public Coach swimCoach() {
        // This method returns a Coach bean, which can be injected into other components.
        // You can customize the bean creation logic here if needed.
        return new SwimCoach();
    }

}
