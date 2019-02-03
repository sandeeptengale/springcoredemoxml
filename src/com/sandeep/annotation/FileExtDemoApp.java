package com.sandeep.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileExtDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortuneService());
        System.out.println(coach.getDetails());
    }
}
