package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		// 대입연산자 =  +=  -=  *=  /=  %=
		int a;
		a = 10;
		
		a = a + 1; // a값을 수정
		System.out.println("a = " + a); // a = 11

		// 확장대입연산자
		a += 1; 
		System.out.println("a = " + a); // a = 12
		
		a++;
		System.out.println("a = " + a); // a = 13
		
		a *= 10; // a = a * 10;
		System.out.println("a = " + a); // a = 130
		
				
		
	} // main method

}
