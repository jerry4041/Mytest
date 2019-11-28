package com.exam;

// 메소드 오버라이딩(Overriding) : 재정의

class Wolf {
	void speak() {
		System.out.println("아우우~~");
	}
} // class Wolf

class Puppy extends Wolf {
	// 메소드 오버라이딩(재정의)
	void speak() {
		System.out.println("멍멍~~");
	}
	
	void sound() {
//		speak(); // this.speak(); // 자신과 부모를 구분 해주어야 한다.
		super.speak(); 
	}
} // class Puppy 

public class Ex3 {

	public static void main(String[] args) {
		Puppy puppy = new Puppy();
//		puppy.speak();
		puppy.sound();

	} // main method

} // class Ex3
