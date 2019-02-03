package com.sandeep.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from container
        Coach coach = appContext.getBean("myCoach", Coach.class);
        //call method from bean
        System.out.println(coach.getDailyWorkout());
        //get fortune for a day
        System.out.println(coach.getDailyFortune());
        //close the context

        //--------End of Constructor DI----------
        CricketCoach cricketCoach = appContext.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDetails());

        //---------End of Setter DI-------------
        appContext.close();
    }
}
