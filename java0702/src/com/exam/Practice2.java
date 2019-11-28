package com.exam;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 문제1: 년도4자리를 입력받아 해당 년도가 윤년인지 판단하는 프로그램 작성
		// 4의 배수이면서 100의 배수가 아닌해 + 400의 배수이면 윤년 아니면 평년
		Scanner scanner = new Scanner(System.in);
		int year;
		String isYoon;
		
		System.out.print("연도 입력:");
		year = scanner.nextInt();
		
		isYoon = ((year % 4 == 0 && year % 100 != 0) || 
				 (year % 400 == 0)) ? "윤년입니다." : "평년입니다.";
		System.out.println("해당 년도는 " + isYoon);
		
		// 문제2: 생년을 입력하여 그해의 띠를 구하시요
		// 쥐, 소, 범, 토끼, 용, 뱀, 말, 양, 원숭이, 닭, 개, 돼지
		Scanner scanner2 = new Scanner(System.in);
		int a;
		String born;
		
		System.out.print("생년을 입력:");
		a = scanner.nextInt();
		
		if(a % 12 == 4) born = "쥐띠";
		else if(a % 12 == 5) born = "소띠";
		else if(a % 12 == 6) born = "범띠";
		else if(a % 12 == 7) born = "토끼띠";
		else if(a % 12 == 8) born = "용띠";
		else if(a % 12 == 9) born = "뱀띠";
		else if(a % 12 == 10) born = "말띠";
		else if(a % 12 == 11) born = "양띠";
		else if(a % 12 == 0) born = "원숭이띠";
		else if(a % 12 == 1) born = "닭띠";
		else if(a % 12 == 2) born = "개띠";
		else born = "돼지띠";
		
		System.out.println("당신은 " + born + " 입니다.");
		
		//https://blog.naver.com/ibbanto/221129956424<<스위치문 연습
		
	} // main method

}
