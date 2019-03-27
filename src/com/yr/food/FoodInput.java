package com.yr.food;

import java.util.Scanner;

public class FoodInput {
	

	public Food[] makeFood() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("메뉴 수를 입력하세요");
		int select = sc.nextInt();
		
		Food[] foods = new Food[select];
		
		for(int i=0; i<foods.length;i++) {
			Food food = new Food();
			System.out.println("메뉴 이름 입력");
			food.menuName = sc.next();
			System.out.println("가격 입력");
			food.price = sc.nextInt();
			System.out.println("재고수량 입력");
			food.stock = sc.nextInt();
	/*		System.out.println("판매수량 입력");
			food.sell=sc.nextInt();*/
			foods[i]=food;	// food배열에 메뉴 입력
			
		} 	return foods;
	}
	
	//public Food[] sellFood() { 
	// }
	
}

