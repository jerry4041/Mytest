package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.print("a변수 출력\n");
		System.out.println("a = " + a);
		System.out.printf("a = %d\n", a);
		
		// %d 정수    %f 실수    %c 문자     %s 문자열
		System.out.println("a="+a+", b="+b);
		System.out.printf("a=%d, b=%d\n", a, b);
		
		double c = 3.14, d = 4.56;
		System.out.println("c="+c+", d="+d);
		System.out.printf("c=%.2f, d=%.2f\n", c, d);
		
		char ch = 'A';
		String str = "안녕하세요";
		
		System.out.printf("문자: %c\n", ch);
		System.out.printf("문자열: %s\n", str);
	}

}


