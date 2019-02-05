package com.sandeep.javaconfig;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "Today is bit a sad day";
    }
}
