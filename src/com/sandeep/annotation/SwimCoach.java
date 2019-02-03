package com.sandeep.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Value("${foo.age}")
    private String age;

    @Value("${foo.athleteType}")
    private String athleteType;

    @Autowired
    @Qualifier("rockingFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getWorkout() {
        return "Take a 100 min butterfly style";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }

    public String getDetails() {
        return "Coach age: " + age + " Athlete type: " + athleteType;
    }
}
