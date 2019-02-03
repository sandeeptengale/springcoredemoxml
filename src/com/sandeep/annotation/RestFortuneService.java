package com.sandeep.annotation;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "Restful fortune service";
    }
}
