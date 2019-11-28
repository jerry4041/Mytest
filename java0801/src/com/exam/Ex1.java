package com.exam;

abstract class Animal { // 다형성의 범위가 좁다 -> 인터페이스 사용
	abstract void speak();
} // Animal class

class Dog extends Animal implements DetectionAgent {
	@Override
	void speak() {
		System.out.println("멍멍~~");
	}

	@Override
	public void detect() {
		System.out.println("킁킁~ 강아지가 탐지하다~~");
	}

	void beFriendly() {
		System.out.println("친근하게 굴기~");
	}
} // Dog class

interface DetectionAgent {
	// 탐지 요원
	/* public abstract */ void detect();
}

class Person implements DetectionAgent {

	@Override
	public void detect() {
		System.out.println("탐지요원으로 일하기");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Animal animal = new Dog(); // 업캐스팅 = 다형성
		animal.speak(); // JVM이 동적바인딩을 해서 멍멍을 호출

		Dog dog = (Dog) animal; // 다운캐스팅
		dog.beFriendly();

		DetectionAgent agent = dog; // 업캐스팅 = 다형성
		agent.detect();

		agent = new Person(); // 다형성
		agent.detect();
		
	} // main method

} // Ex1 class
