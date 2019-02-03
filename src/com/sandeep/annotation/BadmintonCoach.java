package com.sandeep.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

    @Autowired
    @Qualifier("rockingFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getWorkout() {
        return "Play high rally for 10 minutes";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }
}
