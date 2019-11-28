package com.exam;

class A extends Object{ 
	// Object 태초의 클래스 생략 된것임
	// 상위 클래스가 초기화 되는것이 중요하다
	A() {
//		super(); // 원래는 슈퍼가 있지만 생략된것임
		System.out.println("생성자A");
	}
}

class B extends A {
	B() {
//		super();
		System.out.println("생성자B");
	}
}

class C extends B {
	C() {
//		super();
		System.out.println("생성자C");
	}
	
	C(int num) {
		this(); // super가 오는것과 똑같다 
	}
}


public class Ex5 {

	public static void main(String[] args) {
		C c = new C();
	
		
	} // main method

} // class Ex5
