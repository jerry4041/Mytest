package com.exam;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.print("키를 입력하세요: ");
		int height = scanner.nextInt(); // 키 175cm
		
		double dHeight = height/100.0;
		
				System.out.print("몸무게를 입력하세요: ");
		int weight = scanner.nextInt();// 키 m단위로 저장. 175cm -> 1.75m
		 
		// 몸무게 78kg
				
		// 비만지수bmi = 몸무게kg / 키m의 제곱 	
		double bmi = weight / (dHeight * dHeight);
		int i = (int)(bmi * 100);
		double j = i / 100.0;
		System.out.println("비만지수는 " + j + " 입니다.");
		System.out.printf("비만지수는 %.2f 입니다.\n", bmi);
		/*
		비만지수			출력문장
		30.0이상			고도비만
		25.0이상~30.0미만	비만
		23.0이상~25.0미만	과체중
		18.5이상~23.0미만	표준체중
		18.5미만			체중미달
		*/
		if (bmi >= 30) {
			System.out.println("고도비만");
		} else if (bmi >= 25) {
			System.out.println("비만");	
		} else if (bmi >= 23) {
			System.out.println("과체중");
		} else if (bmi >= 18.5) {
			System.out.println("표준체중");
		} else {
			System.out.println("체중미달");
		}
		
		//switch문
		
	} // main method

}
