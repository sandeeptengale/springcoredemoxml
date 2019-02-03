package com.sandeep.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 10 mins running on the track";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	//init method
	public void doInitilize() {
		System.out.println("TrackCoach: start initialization process" );
	}

	//destroy method
	public void doDestroy() {
		System.out.println("TrackCoach: Destroy the bean");
	}
}
