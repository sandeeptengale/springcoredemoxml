package com.sandeep.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String teamName;
    private String age;
    private String athleteType;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAthleteType(String athleteType) {
        this.athleteType = athleteType;
    }

    @Override
    public String getDailyWorkout() {
        return "Bowl for 5 overs on leg-side";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public String getDetails() {
        return "Team : " + teamName + " Email: " + email  + " Age: " + age + " AthleteType: " + athleteType;
    }
}
