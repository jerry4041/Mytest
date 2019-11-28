package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("20+10=" + calc('+',20,10));
		System.out.println("20-10=" + calc('-',20,10));
		System.out.println("20*10=" + calc('*',20,10));
		System.out.println("20/10=" + calc('/',20,10));
	} // main method
	
	public static int calc(char ch, int a, int b) {
		int result=0;
		
		if (ch == '+') {
			result = a + b;
		} else if (ch == '-') {
			result = a - b;
		} else if (ch == '*') {
			result = a * b;
		} else if (ch == '/') {
			result = a / b;
		} 
		return result;
		
//		switch (ch) {
//		case '+' : 
//			result=(a+b); break;
//		case '-' : 
//			result=(a-b); break;
//		case '*' : 
//			result=(a*b); break;
//		case '/' : 
//			result=(a/b); break;
//		}
//		return result;
		
	}
} // class
