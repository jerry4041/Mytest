package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		
		// for문 1이상~100미만의 수 중에서
		// if문	 3과 4의 공배수 출력
		// 	 -> 3으로 나누어 떨어지고 4로도 나누어 떨어지는 수
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 4 == 0)
			System.out.println("3과 4의 공배수는 " + i);
		}
		
		
		
		int oddSum = 0; // 홀수의 합
		int evenSum = 0; // 짝수의 합
		// 출력 "1~10 홀수의 합: 00, 짝수의 합: 00"
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				oddSum = oddSum + i;
			} else {
				evenSum = evenSum + i;
			}
		}
		System.out.println("1~10 홀수의 합: " + oddSum + ", 짝수의 합: " + evenSum);
		
		
	} // main method

}
