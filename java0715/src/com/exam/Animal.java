package com.exam;

// 생성자 오버로딩(중복정의) 규칙
// - 매개변수의 개수가 다르면 허용
// - 매개변수의 개수가 같을때는 매개변수 타입이 다르면 허용 
// - 매개변수의 개수가 2개 이상이고 타입이 서로 다를때
//	 매개변수의 순서가 서로 다르면 허용

public class Animal { 
	// 필드(멤버변수)
	//	문자열 name
	String name;
	//	정수형 age
	int age;
	
	// 기본생성자 // 변수지정 필요없다 
	// 	동물이름은 강아지, 나이는 3살로 초기화
	Animal() {
		name = "강아지";
		age = 3;
	}
	// name받아서 초기화하는 생성자. age는 1살.
	Animal(String _name) {
		name = _name;
		age = 1;
	}
	// age받아서 초기화하는 생성자. name은 강아지
	Animal(int _age) {
		name = "강아지";
		age = _age;
	}
	// name과 age받아서 초기화하는 생성자
	Animal(int _age, String _name) {
		name = _name;
		age = _age;
	}
	Animal(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	// 각 필드별 setter, getter 메서드 만들기
	void setName(String _name) {
		name = _name;
	}
	
	void setAge(int _age) {
		if(_age < 0) {
			age = 0;
		} else {
			age = _age; 
		}
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	// 메서드 run() -> 출력 "age살 name(이)가 뛴다" 
	
	void run() {
		System.out.println(age + "살 " + name + "(이)가 뛴다");
	}
	
	
} // class
