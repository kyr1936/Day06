package com.yr.food;

public class FoodPrint {

	public void print(Food[] foods) {   // 영수증 출력


		

		System.out.println("영수증 출력");
		System.out.println("=====================");


		for(int i=0; i<foods.length;i++) {
			if(foods[i].sell>=1) {
				System.out.println("메뉴 : " + foods[i].menuName);
				System.out.println("개수 : " + foods[i].sell);
				System.out.println("가격 : " + foods[i].price);
				
				Food[] allFoods = new Food[foods.length];
				allFoods[i]=foods[i];
				
				foods[i].sell = 0;
				foods[i].price=0;

			}  // if

		}   // for

	}






	public void allprint(Food[] allFoods) {    // 총 판매

		for(int i=0; i<foods.length;i++) {
			System.out.println("메뉴 : " +foods[i].menuName);
			System.out.println("총 판매 개수 : " + foods[i].sell);
			System.out.println("총 판매 가격 : " + foods[i].price);
		}
	}


}
