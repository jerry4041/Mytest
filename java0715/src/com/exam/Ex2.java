package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.run();
		
		Animal ani2 = new Animal("호랑이");
		ani2.run();
		
		Animal ani3 = new Animal(5);
		ani3.run();
		
		Animal ani4 = new Animal("고양이", 4);
		ani4.run();
		
		ani.setAge(2); // .연산자로 이미 외부에서 특정 객체를 지정해놨음 
		ani.setName("돼지");
		ani.run();
		
		System.out.println(ani.getAge() + "살");
		System.out.println(ani.getName());
	} // main method

} // class Ex2
