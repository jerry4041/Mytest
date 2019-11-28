package com.exam;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피를 드릴까요? : ");
		String order = scanner.next(); // 주문 입력받아서 order에 저장
		int price = 0; 
		/*
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:	
			System.out.println("메뉴에 없습니다!");
		}
		
		if (price > 0) {
			System.out.println(order + "는 " + price + "원 입니다.");
			scanner.close();
			
		}
		*/
		if (order.equals("에스프레소")
				|| order.equals("카푸치노")
				|| order.equals("카페라떼")) {
			price = 3500;
		} else if (order.equals("아메리카노")) {
			price = 2000;
		} else {
			System.out.println("메뉴에 없습니다!");
		}
		if (price > 0) {
			System.out.println(order + "는 " + price + "원 입니다.");
		}
			
		
		
	}// main method

}
