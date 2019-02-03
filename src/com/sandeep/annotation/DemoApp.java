package com.sandeep.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        //Setter based injection using Annotation
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        System.out.println(footballCoach.getWorkout());
        System.out.println(footballCoach.getFortuneService());

        //Constructor based injection using Annotation
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach.getWorkout());
        System.out.println(tennisCoach.getFortuneService());

        //Field based injection using Annotation
        Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);
        System.out.println(badmintonCoach.getWorkout());
        System.out.println(badmintonCoach.getFortuneService());
        context.close();
    }
}
