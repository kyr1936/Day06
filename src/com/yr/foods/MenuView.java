package com.yr.foods;

public class MenuView {            // 영수증 출력, 결산 출력

	public void orderView(Food[] foods, int[] counts) {
		int sum=0;
		for(int i =0; i<counts.length;i++) {
			if(counts[i]>0) {
				System.out.println("구매내역");
				System.out.println("메뉴명 : " + foods[i].name);
				System.out.println("단가 : " + foods[i].price);
				System.out.println("구매수량 : " + counts[i]);
				System.out.println("합 계 : " + foods[i].price*counts[i]);
				sum=sum+foods[i].price*counts[i];
				foods[i].count=foods[i].count+counts[i];

				System.out.println("---------------------------");


			}
		}
		System.out.println("총 합 계 : " + sum );

		System.out.println("영수증 출력");




	}

	public void count(Food[] foods) {
		int sum=0;
		for(int i =0; i<foods.length;i++) {  
			System.out.println("메뉴명 : " + foods[i].name);
			System.out.println("판매 수 : " + foods[i].count);
			System.out.println("판매액 : " + foods[i].count*foods[i].price);
			System.out.println("==============================");
			sum= sum+foods[i].count*foods[i].price;	
		}
		System.out.println("총 판매액 : " + sum);
	}



}
