package com.sandeep.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getWorkout() {
        return "Play 15 rally non-stop";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }
}
