package com.sandeep.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Keep only one component scan in a package
 */
@Configuration
//@ComponentScan("com.sandeep.javaconfig")
public class SportsConfig {
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        SwimCoach swimCoach = new SwimCoach(sadFortuneService());
        return swimCoach;
    }
}
