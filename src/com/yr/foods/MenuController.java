package com.yr.foods;

import java.util.Scanner;

public class MenuController {		// 메뉴 선택

	public void start() {
		// 1. 메뉴등록
		MenuAdd menuAdd = new MenuAdd();

		boolean check = true;
		Scanner sc = new Scanner(System.in);
		MenuView menuCount = new MenuView();

		Food[] foods = menuAdd.add();
		int [] counts = new int[foods.length];

		while(check) {
			System.out.println("1. 주문   2. 결산");
			int select = sc.nextInt();

			if (select==1) {
				while(true) {
					for(int i=0; i<foods.length; i++) {
						System.out.println(i+1 +".   "+ foods[i].name + ",  " + foods[i].price);

					} 
					System.out.println(foods.length+1 + ". 주문하기");
					select =sc.nextInt();
					if(select<=foods.length) {
					System.out.println("수량 입력");
					counts[select-1] = sc.nextInt();
					} else {
						menuCount.orderView(foods, counts);    //영수증 출력
						break;
					}
				}

			} else {
				menuCount.count(foods);

				check =!check;
			}	





		}
	}
}
