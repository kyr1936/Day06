package com.yr.food;

import java.util.Scanner;

public class FoodOrder {

	public void order(Food[] foods) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		int amount =0;
		boolean check = true;
		FoodView fv = new FoodView();
		FoodPrint fp = new FoodPrint();



		while(check) {
			System.out.println("메뉴선택");
			fv.foodlist(foods);
			System.out.println((foods.length+1) + ". 주문");
			num = sc.nextInt(); //  메뉴선택


			for(int i=0; i<foods.length; i++) {

				if(num==i+1) {
					System.out.println("수량을 입력하세요.");
					amount=sc.nextInt(); // 수량입력
					System.out.println(foods[i].menuName + ", " + amount +" 개 주문");
					System.out.println("--------------------");
					foods[i].stock = foods[i].stock-amount;
					foods[i].sell += amount;
					foods[i].price = foods[i].price*amount;
				} 
			} //for문	


			if(num==foods.length+1) {
				fp.print(foods);
				check =!check;
			} 	//allFoods[i]= foods[i];
		} //while문 		


	}

}
