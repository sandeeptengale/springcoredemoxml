package com.sandeep.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Value("${foo.email}")
    private String email;

    @Value("${foo.web}")
    private String website;

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getWorkout() {
        return "Dribble as you want";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }

    public String getDetails() {
        return "Email: " + email + " Website: " + website;
    }
}
