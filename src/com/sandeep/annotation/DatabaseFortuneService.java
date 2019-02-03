package com.sandeep.annotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "Database fortune service";
    }
}
