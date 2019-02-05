package com.sandeep.javaconfig;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getWorkout() {
        return "Swim for 400 mts non-stop";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortuneService();
    }
}
