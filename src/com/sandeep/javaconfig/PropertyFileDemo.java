package com.sandeep.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyFileDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InfoConfig.class);
        FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortuneService());
        System.out.println(coach.getDetails());
    }
}
