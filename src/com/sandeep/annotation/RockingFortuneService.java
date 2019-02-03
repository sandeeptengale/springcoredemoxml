package com.sandeep.annotation;

import org.springframework.stereotype.Component;

@Component
public class RockingFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "Your day will be rocking";
    }
}
