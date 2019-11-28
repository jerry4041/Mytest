package com.exam;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		System.out.println("===== 프로그램 시작됨. =====");
		// String str = "안녕";

		// 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();
        System.out.println("이름: " + name);
		
		System.out.print("올해 나이를 입력하세요: ");
		int age = scanner.nextInt(); // "33" -> 33
		System.out.println("내년 나이는: " + (age+1));
		
		System.out.print("몸무게를 입력하세요: ");
		double weight = scanner.nextDouble(); // "64.5" -> 64.5
		System.out.println("몸무게: " + (weight));
		

		System.out.println("===== 프로그램 종료됨. =====");
		
		

	}

}
