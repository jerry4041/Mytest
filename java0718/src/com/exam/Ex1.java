package com.exam;

class StaticTest {
	// static은 클래스단위 필드.클래스변수.정적변수.
	// 클래스마다 한개씩 가짐 
	// 이 클래스로부터 생성된 각 객체들이 공유하는 용도.
	static int a = 10;
	
	// static 메소드는 static필드만 사용가능!
	// static 메소드 안에서는 this참조변수 사용불가!
	static void printA() {
		System.out.println("a = " + a);
//		System.out.println("b = " + b);
	}
	
	//===============================================
	
	// 인스턴스 필드.인스턴스변수.인스턴스마다 한개씩 가짐.
	int b = 20;
	
	void printAandB() {
		System.out.println("a = "+a+", b = "+b);
	}
	
	
} // class StaticTest


public class Ex1 {

	public static void main(String[] args) {
		// static : 접근지정자 static final 
		//    객체생성없이 바로 필드 또는 메소드에 접근하기 위해.
		//    클래스(static) 필드, 클래스(static) 메소드
		System.out.println("StaticTest.a = " + StaticTest.a); // 10
		StaticTest.printA();
		
//		System.out.println("StaticTest.b = " + StaticTest.b);
		StaticTest st = new StaticTest();
		System.out.println("st.b = " + st.b);
		
		// a와 b 1씩 증가
		StaticTest.a = StaticTest.a + 1;
		st.b = st.b + 1;
		System.out.println("StaticTest.a = " + StaticTest.a); // 11
		System.out.println("st.b = " + st.b); // 21
		
		// 새로운 객체 생성
		StaticTest st2 = new StaticTest();
		// a와 b 1씩 증가
		StaticTest.a = StaticTest.a + 1;
		st2.b = st2.b + 1;
		System.out.println("StaticTest.a = " + StaticTest.a); // 12
		System.out.println("st.b = " + st2.b); // 21
		
		
		
		// Math클래스의 모든 멤버는 static이다.
//		Math math = new Math();
		System.out.println("원의면적: "+(5*5*Math.PI));
		System.out.println("절대값: "+Math.abs(-5));
		
		
		
	} // main method

} // class Ex1
