package com.exam;

class MethodTest2 {
	int abs(int a) {
		if (a < 0) {
			a = -a;
		}
		return a;
	}
	// 메소드 시그니처(method signature)
	public double abs(double a) {
		if (a < 0) {
			a = -a;
		}
		return a;
	}
	
	// 메소드 리턴타입은 메소드 오버로딩과 관계없음
//	private double abs(double a) {
//		return 0.0;
//	}
	
}

public class Ex3 {

	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		System.out.println("-5의 절대값: "+mt.abs(-5));
		System.out.println("-3.4의 절대값: "+mt.abs(-3.4));
	} // main method

}
