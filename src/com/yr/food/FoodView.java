package com.yr.food;

public class FoodView {
	
	public void foodlist(Food[] foods) {
		
		for(int i=0; i<foods.length;i++) {
	
			System.out.println((i+1) + ". " +foods[i].menuName);

		} 
	}
}
