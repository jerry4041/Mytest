package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		// 반복문 for	 while	 do~while
		
//		for (초기식; 조건식; 증감식) {
//			반복수행할 문장;
//		}
		
		// 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello " + i);
		}
		
		// 11 12 13 14 15 16 17 18 19 20
		for (int i = 11; i <= 20; i++) {
			System.out.println("Hello " + i);
		}
		
		// 0 1 2 3 4 5 6 7 8 9
		for (int i = 0; i <= 9; i++) { // i=i+1; i+=i; i++;
			System.out.print(i + " ");
		}
		System.out.println();
		// 2 4 6 8 10 12 14 16 18 20
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 10 9 8 7 6 5 4 3 2 1
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
	} // main method
}
