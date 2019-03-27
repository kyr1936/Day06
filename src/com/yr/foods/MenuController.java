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
		
		
		while(check) {
			System.out.println("1. 주문   2. 결산");
			int select = sc.nextInt();
			
			if (select==1) {
				for(int i=0; i<foods.length; i++) {
					System.out.println(i+1 +".   "+ foods[i].name + ",  " + foods[i].price);
					
				} System.out.println(foods.length+1 + ". 주문하기");
					select =sc.nextInt();
				
				
			} else {
				menuCount.count();
				
				check =!check;
			}	
			
			
			
			
			
		}
	}
}
