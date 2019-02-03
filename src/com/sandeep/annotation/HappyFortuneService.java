package com.sandeep.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "Today will be your lucky day";
    }
}
