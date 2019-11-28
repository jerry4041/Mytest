package com.exam2;

//추상클래스 Shape2D
//	추상메소드  void draw()
abstract class Shape2D {
	abstract void draw();
}

//클래스 Cir  상속 Shape2D
//	메소드 오버라이딩 -> 출력 "원을 그린다."
class Cir extends Shape2D {

	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
}

//클래스 Rec  상속 Shape2D
//	메소드 오버라이딩 -> 출력 "사각형을 그린다."
class Rec extends Shape2D {

	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}

//클래스 Tri  상속 Shape2D
//	메소드 오버라이딩 -> 출력 "삼각형을 그린다."
class Tri extends Shape2D {

	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Cir c = new Cir();
		c.draw();

		Rec r = new Rec();
		r.draw();

		Tri t = new Tri();
		t.draw();

	} // main method

} // Ex2 class
