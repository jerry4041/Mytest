package com.exam;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// 문제1: 정수3개를 입력받아 그 중 가장 큰수 1개를 출력
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		String result;

		System.out.print("정수 a를 입력:");
		a = scanner.nextInt();

		System.out.print("정수 b를 입력:");
		b = scanner.nextInt();

		System.out.print("정수 c를 입력:");
		c = scanner.nextInt();

		result = (a > b && a > c) ? "a" : (b > a && b > c) ? "b" : "c"; // 이 방법 말고 다른 방법으로 출력할수 있는 방법은? if문으로 출력 가능?

		System.out.println("가장 큰 정수는 " + result);

		// 문제2: 정수1개를 입력받아 "홀수"인지 "짝수"인지 출력
		Scanner scanner2 = new Scanner(System.in);
		int num;
		String result2;

		System.out.print("정수를 입력:");
		num = scanner2.nextInt();

		result2 = (num == 0) ? "0" : (num % 2 == 0) ? "짝수" : "홀수";

		System.out.println("정수는 " + result2 + "입니다"); // if문으로 가능한지?

	} // main

}
