package com.exam;

class MethodTest4 {
	// 가변인자 적용해서 메소드 정의
	int sum(int a, int b) {
		return a + b;
	}
	int sum(int a, int b, int c) {
		return a + b + c;
	}
	int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	
	int sum(int...array) {
		int sum=0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	} 
	// 가변인자는 가장 마지막에 선언해야 됨!
	// sum("문자열", 3.14, 10, 20, 30);
	int sum(String str, double d, int...arr) {
		return 0;
	}
	// sum("문자열", 10, 20, 30, 3.14);
//	int sum(String str, int...arr, double d) {
//		return 0;
//	}
	// sum(10, 20, 30, "문자열", 3.14);
//	int sum(int...arr, String str, double d) {
//		return 0;
//	}
	
}// class MethodTest4

public class Ex5 {

	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		System.out.println(mt.sum(10, 20));
		System.out.println(mt.sum(10, 20, 30));
		System.out.println(mt.sum(10, 20, 30, 40));
		System.out.println(mt.sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
		
		MethodTest4 mt2 = new MethodTest4();
		
		
		mt2 = mt;
		
		
		
		
	}// main method

}// class Ex5
