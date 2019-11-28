package com.exam;

class MethodTest {
	// 메소드 오버로딩(중복정의)
	// : 같은 클래스 내에서 메소드 이름은 동일하게
	// -> 매개변수 개수 다르든,
	//	  매개변수 개수 같을때 타입이 다르게
	void print(int a) {
		System.out.println(a);
	}
	void print(Double a) {
		System.out.println(a);
	}
	void print(Character a) {
		System.out.println(a);
	}
	void print(Boolean a) {
		System.out.println(a);
	}
	void print(String a) {
		System.out.println(a);
	}
} // class MethodTest



public class Ex2 {

	public static void main(String[] args) {
		// 객체 생성 mt
		MethodTest mt = new MethodTest();
		// 메소드 호출
		mt.print(10);
		mt.print(3.4);
		mt.print('A');
		mt.print(true);
		mt.print("안녕");
		
		System.out.println("=================");
		
		
		
	} // main method

} // class Ex2
