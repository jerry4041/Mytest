package com.exam;

// 상속에서 final 키워드

/* final */ class Parent { // 클래스 상속 못하게 막아줌
	// 필드를 상수화할때는 주로 static final로 사용함!
	static final int PUPPY = 1; // 상수
	static final int CAT = 2;   // 상수
	
	// -> static이 없으면 객체가 생성될때마다 만들어져 메모리 낭비다 
	// 	  그래서 static으로 지정하여 클래스영역에 공통으로 지정한다
	
	/* final */ int a = 10; // 필드값 변경못하게 함. 상수화

	/* final */ void print() { // 메소드 오버라이딩 못하게 막아줌
		System.out.println("Parent - print()");
	}
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Child - print()");
	}
}

public class Ex2 {

	public static void main(String[] args) {

	}

}
