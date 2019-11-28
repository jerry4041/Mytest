package com.exam;

public class Person {
	// 필드(멤버변수)
	// 	문자열 name 데이터은닉
	private String name;
	// 	정수형 age 데이터은닉
	private int age;
	// 기본생성자	이름:"홍길동" 나이:22
	public Person() {
		this.name = "홍길동";
		this.age = 22;
	}
	// getter / setter 메소드 전체공개
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
		
} // class
