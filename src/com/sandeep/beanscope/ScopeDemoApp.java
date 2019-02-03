package com.sandeep.beanscope;

import com.sandeep.springdemo.Coach;
import com.sandeep.springdemo.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        Coach coach1 = context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach", Coach.class);

        //Check if both coach are same Coach, since its singleton by default
        boolean result = (coach1 == coach2);

        System.out.println("Matching result of coach: " + result);
        System.out.println(coach1);
        System.out.println(coach2);

        // Check the life cycle of the spring bean, it works only for singleton bean not for prototype
        // Prototype bean should manage its own lifecycle
        TrackCoach trackCoach = context.getBean("trckCoach", TrackCoach.class);
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        context.close();
    }
}