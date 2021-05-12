package com.swapnil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringSetterDependencyDemoApp {

	public static void main(String[] args) {
		// Load the Spring Configuration File
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the Bean from Spring Container
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Make use of Bean methods
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Call methods on the dependency object
				
		System.out.println(theCoach.getDailyFood());
		
		// Close Context

		context.close();
	}

}
