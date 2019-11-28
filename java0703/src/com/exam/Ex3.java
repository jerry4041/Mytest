package com.exam;

import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + (2 * i));
		}
		// 구구단 5단 출력
		for (int j = 1; j <= 9; j++) {
			System.out.println("5 * " + j + " = " + (5 * j));
		}
		// 화씨온도
		// 섭씨온도 (0도 ~ 100도)
		// 화씨온도 = 섭씨온도 * 9 / 5 + 32
		// 출력 "섭씨 몇도 -> 화씨 몇도
		int f = 0;
		for (int c = 0; c <= 100; c++) {
			f = c * 9 / 5 + 32;
			System.out.println("섭씨: " + c + "도" + " -> " + "화씨: " + f + "도");
		}
		//    
		for(int i=2; i<20; i*=1) {
			System.out.println(i);
		}
		
		

	} // main method

}
