package com.sandeep.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    public FootballCoach() {
        System.out.println(">> Inside football default constructor");
    }

    @Autowired
    @Qualifier("databaseFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> Inside setFortuneService() class");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Practise mid-field for 10 mins";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }
}
