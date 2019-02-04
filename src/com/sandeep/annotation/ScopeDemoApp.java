package com.sandeep.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = theCoach == alphaCoach;
        System.out.println("Same object? " + result);
        System.out.println("The Coach: " + theCoach);
        System.out.println("Alpha coach: " + alphaCoach);

        context.close();
    }
}
