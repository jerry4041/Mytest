package com.exam;

public class Ex4 {

	public static void main(String[] args) {

		// 1~10 반복
		// 1부터 10까지 누적합
		// 1+2+3+4+5+6+7+8+9+10

		int sum = 0; // 덧셈 누적변수를 0으로 초기화
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			sum += i; // sum += i;
			System.out.println("sum = " + sum);
		}
		System.out.println("1~10까지 합: " + sum);

		sum = 0;
		// 1부터 100까지의 누적합 구해서 출력하기
		for (int i = 1; i <= 100; i++) {
			System.out.println("i = " + i);
			sum = sum + i; // sum += i;
			System.out.println("sum = " + sum);
		}
		System.out.println("1~100의 합: " + sum);

		sum = 0;
		// 1부터 10 중 홀수의 합 구해서 출력하기
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println("i = " + i);
			sum += i; 
			System.out.println("sum = " + sum);
		}
		System.out.println("1~10까지 홀수의 합: " + sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)  { // 홀수: 2로 나눌때 나머지가 1
				System.out.println("i = " + i);
				sum += i;
				System.out.println("sum = " + sum);
			}
		}
		System.out.println("1~10까지 홀수의 합: " + sum);

		int mul = 1; // 누적곱 저장할 변수
		// 1부터 10까지의 누적합 구해서 출력하기
		for (int i = 1; i <= 10; i++) {
			mul *= i;
			System.out.println("i = " + i + ", 합계 = " + mul);
		}
		System.out.println("1~10까지 곱의 합계: " + mul);
		

	} // main method

}
