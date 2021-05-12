package com.swapnil.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringConstructorDependencyDemoApp {

	public static void main(String[] args) {
		// Load the Spring Configuration File
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the Bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Call methods on the dependency object
		
		System.out.println(theCoach.getDailyFood());
		
		// Close Context
		context.close();
	}

}
