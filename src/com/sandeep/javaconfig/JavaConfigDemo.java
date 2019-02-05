package com.sandeep.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortuneService());

        //TODO to use this code remove component scan from config file, otherwise it will conflict
        Coach swimCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(swimCoach.getWorkout());
        System.out.println(swimCoach.getFortuneService());
    }
}
