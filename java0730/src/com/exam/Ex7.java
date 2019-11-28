package com.exam;

class Animal {
	void speak() {
		System.out.println("소리내기~~");
	}
} // Animal

class Dog extends Animal {

	@Override // 애노테이션(annotation) : 점검을 해준다
	void speak() {
		System.out.println("멍멍~~");
	}
	
	void beFriendly() {
		System.out.println("사람이랑 친근하게 굴기");
	}
} // Dog

class Cat extends Animal {

	@Override
	void speak() {
		System.out.println("야옹~~");
	}
} // Cat

class Duck extends Animal {

	@Override
	void speak() {
		System.out.println("꽥꽥~~");
	}
} // Duck

class Vet { // 수의사

//	void giveShot(Duck duck) { // 주사놓기 메소드
//		duck.speak(); // 주사맞아서 아야!!
//	}

	void giveShot(Animal animal) { // 주사놓기 메소드
		animal.speak(); // 주사맞아서 아야!!
	}
} // Vet

public class Ex7 {

	public static void main(String[] args) {
		// 정적 바인딩이 일어나는 경우, 1차 바인딩   
		// Cat 참조변수가 컴파일러가 처음의 cat의 스피커 메소드를 이미 잡고 있다. 
		// 그뒤에 JVM이 다시 재점검 한다.그러나 변화가 없다.
		Cat cat = new Cat();
		cat.speak();
		
		System.out.println("============");
		
		// 정적 바인딩 // Animal 참조변수가 컴파일러가 처음의 객체의 스피커메소드를 잡고있다. 
		// 그뒤에 JVM이 다시 재점검한다.
		Animal animal = new Animal();
		animal.speak();
		
		// 동적 바인딩 // Animal 참조변수가 컴파일러가 처음의 
		// 소리내기라는 스피커 메소드를 잡고있다. 
		// 그뒤에 JVM이 최종적으로 재점검한다.(컴파일러를 믿지않는다)
		// 실행시점에 다시 Dog의 스피커 메소드를 호출한다.
		animal = new Dog(); // 업캐스팅(부모타입 = 자식타입)
		animal.speak();
		
		Dog dog = (Dog) animal; // 다운캐스팅(자식타입 = (자식타입형변환)부모타입)
		dog.beFriendly();
		
		animal = new Cat();
		animal.speak();

		System.out.println("============");

		Vet vet = new Vet();
		vet.giveShot(new Dog());
		vet.giveShot(new Cat());
		vet.giveShot(new Duck());
	} // main method

} // class Ex7
