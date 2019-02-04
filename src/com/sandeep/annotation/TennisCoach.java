package com.sandeep.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("restFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void doStartUpActivity() {
        System.out.println("Construction work started");
    }

    @PreDestroy
    public void doShutDownActivity() {
        System.out.println("Destruction work started");
    }

    @Override
    public String getWorkout() {
        return "Play 10 rally in one stretch";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }
}
