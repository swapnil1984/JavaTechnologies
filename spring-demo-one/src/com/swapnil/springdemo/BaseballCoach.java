package com.swapnil.springdemo;

public class BaseballCoach implements Coach {
	
	// Define a private field for Dependency
	
	private FoodService foodService;
	
	// Define a constructor for Dependency
	
	public BaseballCoach(FoodService theFoodService) {
		foodService = theFoodService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5K";
	}

	// Use my foodService to get Food
	
	@Override
	public String getDailyFood() {
		return foodService.getFood();
	}
	
}
