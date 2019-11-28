package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		// 단항연산자 + - (부호) ++ --(증감) !(not) (형변환)
		
		// 증감연산 ++ 1증가 -- 1감소
		
		int a = 0;
		a = a + 1;
		System.out.println("a = " + a); // 1
		
		a++;
		System.out.println("a = " + a); // 2
		
		--a;
		System.out.println("a = " + a); // 2-1 = 1
		
		a--;
		System.out.println("a = " + a); // 1-1 = 0
		
		// 한 명령문에서 수행할 작업이 2개 이상일 때
		// ++앞 : ++먼저 수행 후 다른작업 수행함 -> 선행처리(부르는 용어)
		// 뒤++ : 다른작업 수행 후 마지막으로 ++수행함 -> 후행처리
		
		a = 0;
		int b = 0;
		
		System.out.println("++a : " + ++a); // 1
		System.out.println("b++ : " + b++); // 0
		System.out.println("a = " + a); // 1
		System.out.println("b = " + b); // 1
		
		
		a = 0; 
		b = 0;
		int sum = 0;
		sum = ++a + ++b;
		System.out.println("++a + ++b : " + sum);
		
		a = 0; b = 0; sum = 0;
		sum = a++ + b++;
		System.out.println("a++ + b++ : " + sum);
		
		// 전위연산자 (선행처리) 풀어서 쓰기
		a = 1;
		++a;
		b = a;
		
		// 후위연산자 (후행처리) 풀어서 쓰기
		a = 1;
		b = a;
		a++;
	
		
		
		

	} // main method

}
