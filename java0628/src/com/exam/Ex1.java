package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		/*
		연산자  왼쪽 -> 오른쪽    우선순위   괄호()
		변수 = 수식
		1. 단항연산자  + - 부호   ++ -- (증감)   !(not)   (형변환)
		2. 산술연산자  *  /  %   +  -
		3. 비교연산자  >  <  >=  <=  ==  !=
		4. 논리연산자  && (and)    || (or)
		5. 삼항(조건)연산자   변수 = 조건식 ? 참값 : 거짓값;
		6. 대입연산자  =   +=  -=  *=  /=  %=
		*/
		
		// 정수형끼리 연산할때는 바이트크기 기준으로 큰쪽으로
		// 맞춘뒤에 연산이 수행됨.
		// int형 + long형 -> long형 + long형 -> long형 결과값
		
		// 실수형끼리 연산할때는 바이트크기 기준으로 큰쪽으로
		// 맞춘뒤에 연산이 수행됨.
		// float형 + double형 -> double형 + double형 -> double형 결과값
		
		// 정수와 실수간에 연산할때는 정수가 실수쪽으로 맞춘뒤에
		// 연산이 수행됨.
		// int형 + double형 -> double형 + double형 -> double형 결과값
		
		
		int a=5, b=2;
		// 5/2 -> 2        정수형 / 정수형 -> 정수형나눗셈
		System.out.println("정수형 나눗셈 결과: "+ a/b); // 2
		// 실수형 / 정수형 -> 실수형 / 실수형 -> 실수형나눗셈
		System.out.println("실수형 나눗셈 결과: "+ (double)a/b); // 2.5
		
		// 나머지 연산은 정수형 나눗셈일때만 의미있는 결과가 나옴
		System.out.println("나눗셈 나머지 결과: "+ a%b);
		
		// + 연산자는 두가지 기능 있음
		// 1) 덧셈     2) 문자열 연결
		System.out.println("a+b=" + a+b); // a+b=52
		System.out.println("a+b=" + (a+b)); // a+b=7
		
		
		byte c = 10;
		byte d = 20;       // 연산자가 적용되면 byte, short는 int형으로 변환된 뒤에 연산됨.
		byte sum = (byte) (c + d); // int형+int형 -> int형
		System.out.println("sum = " + sum);
		
		
		
		int e = 1_000_000;
		int f = 2_000_000;
		// int형 * int형 -> int형 결과
		// long형 * int형 -> long형 * long형 -> long형 결과
		long g = (long)e * f;  
		System.out.println("g = " + g);
		
	} // main method

}
