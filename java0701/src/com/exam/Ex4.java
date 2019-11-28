package com.exam;

public class Ex4 {

	public static void main(String[] args) {
		
		// 키 175cm -> 출력 1m 75cm
		// 1m == 100cm
		int h =175; // cm단위
		System.out.println("키는 " + h/100 + "m " + h%100 + "cm");
		
		float pi = 3.141592f;
		// 소수점 셋째자리까지 반올림
		// Math.round() // round는 소수점 첫째자리에서 반올림한다.
		// 3141.592 // 1000곱하기 결과
		// 3142 // 소수점 첫째자리에서 반올림 후 정수로 만든다.
		// 3.142 // 1000f로 나눈 결과
		pi = Math.round(pi * 1000) / 1000f;
		System.out.println("원주율: " + pi);
		
	    
		
		
	} // main method

}
