package com.sandeep.springdemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today will be your luck day";
    }
}
