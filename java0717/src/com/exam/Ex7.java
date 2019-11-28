package com.exam;

public class Ex7 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("성춘향");
		p.setAge(33);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		// 객체 배열
		Person [] personArr; // Person타입 배열변수 선언
		personArr = new Person[10];
		
		for (int i=0; i<personArr.length; i++) {
			personArr[i] = new Person();
			personArr[i].setAge(30 + i);
		}
	} // main method

} // class Ex7
