package com.yr.food;

import java.util.Scanner;


public class FoodMenu {

	public void select () {

		Scanner sc = new Scanner(System.in);

		FoodInput fi = new FoodInput();
		FoodView fv = new FoodView();
		FoodPrint fp = new FoodPrint();
		FoodOrder fo = new FoodOrder();

		boolean check=true;

		Food [] foods = null;
		
		Food[] allFoods =null;
		
		foods=fi.makeFood();
		allFoods=foods;
		  
		while (check) {
			System.out.println("1. 주문   2. 결산");
			int select = sc.nextInt();

			switch(select) {
			case 1:
				fo.order(foods);
				
					 break;
					 
			case 2: 
				
				fp.allprint(foods);
					break;
			}


		
		
	} //while


	}



}
