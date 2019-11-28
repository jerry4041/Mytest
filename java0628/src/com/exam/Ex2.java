package com.exam;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== 프로그램 시작 =====");
		
		System.out.print("숫자 a값을 입력하세요: ");
		int a = scanner.nextInt();
		
		System.out.print("숫자 b값을 입력하세요: ");
		int b = scanner.nextInt();
		
		int c = a + b;
		System.out.println("a + b -> " + c);
		
		// p.85
		boolean result = a > b;
		System.out.println("a > b -> " + result);
		
		System.out.println("a < 100 -> " + (a < 100));
		
		System.out.println("a != b -> " + (a != b));
		
		
		// 삼항(조건)연산자
		// 변수 = 조건식 ? 참값 : 거짓값;
		
		// 최대값
		int max = (a > b) ? a : b;
		System.out.println("최대값 : " + max);
		
		//최소값
		int min = (a < b) ? a : b;
		System.out.println("최소값 : " + min);
		
		// a의 절대값 구하기
		// 양수 -> 양수, 음수 -> 양수
		int abs = (a < 0) ? -a : a;
		System.out.println("변수 a의 절대값 : " + abs);
		
		// a변수값이 "홀수"인지 "짝수"인지 출력
		// 짝수: a를 2로 나누었을때 나머지가 0이면 짝수. 2의 배수.
		// 홀수: a를 2로 나누었을때 나머지가 1이면 홀수. 
		String str = (a%2 == 0) ? "짝수" : "홀수";
	    System.out.println("a는 " + str);
	    
	    System.out.println("===== 프로그램 종료 =====");
		

	} // main method

}




