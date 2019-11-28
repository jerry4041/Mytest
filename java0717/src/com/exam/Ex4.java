package com.exam;

class MethodTest3 {
	
	// prn() -> 정수형 1개 받아서 출력
	void prn(int a) {
		System.out.println(a);
	}
	// prn() -> 정수형 2개 받아서 한줄로 출력
	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	// prn() -> 정수형 3개 받아서 한줄로 출력 "10 20 30"
	void prn(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
	// VarArgs(Variable Arguments): 가변인자, 비정형 인자
	void prn(int...num) {
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
	}
	
}

public class Ex4 {

	public static void main(String[] args) {
	MethodTest3 mt = new MethodTest3();
	mt.prn(10);
	mt.prn(10, 20);
	mt.prn(10, 20, 30);
	mt.prn(10, 20, 30, 40);
	mt.prn(10, 20, 30, 40, 50);
	mt.prn(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
	}// main method

}// class Ex4
