package com.exam;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		// 제어문(조건문, 반복문)

		// 조건문 if switch
		// 반복문 for while do~while

//		if (조건식) {
//			조건이 참일때 실행할 문장;
//			...;
//		}

		int a = -7;
		if (a < 0) { // a변수값이 음수라면
			a = -a; // 부호를 반대로
			int num = 0;
			// ...
		}
		System.out.println("절대값: " + a);
//		int num = 10; 
		// 변수는 main method 안에서 살아있으며
		// if문 안에서는 중괄호 안에서 살아남았다가 없어진다.

//		if (조건식) {
//			참일때 실행문;	
//		} else {
//			거짓일때 실행문;
//      }

		a = 30;
		int b = 20;
		int max = 0;
		if (a > b) {
			max = a;
		} else { // a <= b
			max = b;
		}
		System.out.println("최대값: " + max);

		a = 7;
		// 변수 a의 값이 짝수이면 "짝수" 출력
		// 변수 a의 값이 홀수이면 "홀수" 출력
		String str = "";
		if (a % 2 == 0) { // a는 짝수
			str = "짝수";
		} else { // a는 홀수
			str = "홀수";
		}
		System.out.println(a + "는 " + str + "입니다.");

		a = 30;
		b = 20;
		int min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		System.out.println("최소값: " + min);
		
		
		/*
		if (조건식1) {			
		} else {
			if (조건식2) {				
			} else {
				if (조건식3) {					
				} else {
					// ...
				}
			}
		}
		*/
		
//		if (조건식1) {
//			조건식1 참일때 실행문;
//		} else if (조건식2) {
//			조건식1 거짓, 조건식2 참 실행문;
//		} else if (조건식3) {
//			조건식1,2 거짓, 조건식3 참 실행문;
//		} else {
//			조건식1,2,3,4 모두 거짓 실행문;
//		}
		
		a = -5;
		// 양수 영 음수
		if (a > 0) {
			System.out.println("양수");
		} else if (a == 0) {
			System.out.println("영");
		} else if (a < 0) {
			System.out.println("음수");
		}
		
		
		int score = 90;
		if (score >= 90) {
			System.out.println("학점은 A");
		} else if (score >=80) { // A : 90~100
			System.out.println("학점은 B");
		} else if (score >=70) { // B : 80~89
			System.out.println("학점은 C");
		} else if (score >=60) { // C : 70~79
			System.out.println("학점은 D");
		} else { // D : 60~69
			System.out.println("학점은 F");
		} // F :  0~59
		
		
		score = 90;
		String grade = ""; // 학점
		// 다중if문
		if (score >= 98 && score <= 100) {
			grade = "A+";
		} else if (score >= 94) {
			grade = "A";
		} else if (score >= 90) {
			grade = "A-";
		} else
			grade = "B";
		
		System.out.println("학점은.. " + grade);
		
		// 중첩if문
		if (score >= 90) {
			grade = "A";
			if (score >= 98) {
				grade = "A+";
			} else if (score >= 94) {
				grade = "A";
			} else {
				grade = "A-";
			}
		} else {
			grade = "B";
		}
		
		// A 90점 이상
		//			A+ 98~100
		//			A  94~97
		//			A- 90~93
		// B 80점 이상
		System.out.println("학점 : " + grade);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int point = scanner.nextInt();	
		System.out.println("학년을 입력하세요(1~4): ");
		int year = scanner.nextInt();
		
		if(point >= 60) {
			if(year != 4) {
				
			}
		}
		
		
	} // main method

}
