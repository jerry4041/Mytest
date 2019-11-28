package com.exam;

public class Practice1 {

	public static void main(String[] args) {

		// 문제1: 0부터 9까지 출력 (세로 말고 가로로)
		for (int i=0; i<=9; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("--------------------------");

		// 문제2: 1부터 100까지의 합 출력
		int sum = 0;
		for (int i=0; i<=100; i++) {
			 sum = sum += i;
		}
		System.out.println("1~100까지의 합은 " + sum);
		System.out.println("--------------------------");

		// 문제3: 1부터 10까지 덧셈식 및 합을 출력(가로)
		int sum2 = 0;
		
		// 문제4: 중첩 for문으로 구구단 출력(1단부터 9단까지 가로로)
		// 예) 1*1=1 1*2=2 1*3=3

		// 문제5: 10개의 별 출력

		// 첫번째
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
		// 두번째 (역순)
		for (int j = 0; j < 10; j++) {
			for (int i = j; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------");

		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// 중첩 for문 + if문 합해서 10개의 별 역순 만들기

	} // main method

}
