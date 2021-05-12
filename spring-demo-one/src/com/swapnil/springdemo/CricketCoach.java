package com.swapnil.springdemo;

public class CricketCoach implements Coach {

	private FoodService foodService;
	
	public CricketCoach() {
	
	}
	
	public void setFoodService(FoodService theFoodService) {
		foodService = theFoodService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice on Fast Bowling";
	}

	@Override
	public String getDailyFood() {
		return "Eat Today's Food at 1 PM. " + foodService.getFood();
	}

}
