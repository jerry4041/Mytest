package com.exam;

// super. this. <- 객체의 접근가능영역 기준으로 구분
// super. 은 부모멤버와 자식멤버 이름이 같은경우 서로 구별을 위해 사용함.


class Employee { // 사원 클래스
	private String name; // 이름
	private int salary;  // 급여

	Employee() {
	}

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	String getEmployee() {
		return name + ", " + salary;
	}
} // class Employee

class Manager extends Employee { // 생성자는 상속의 대상이 아니다.
	// String name;   // 필드 오버라이딩(실무에서 권장하지 않는다.)
	String depart; // 부서명
	
	// 부모클래스의 name과 구분되어 있다. this.name은 자식클래스의 것 / super.name은 부모클래스의 것
	
	// 생성자 name salary depart 받는 생성자
	Manager(String name, int salary, String depart) {
		super(name, salary);
//		super.name = name;
//		super.salary = salary;
		this.depart = depart;
	}

	
	String getManager() {
	//  return name + ", " + salary + depart;		
		return super.getEmployee() + ", " + depart; // this.보다는 super.이 더 권장된다
	}

} // class Manager

public class Ex2 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 10000);
		System.out.println(emp.getEmployee());
		
		Manager man = new Manager("성춘향", 20000, "총무");
		System.out.println(man.getEmployee());
		System.out.println(man.getManager());
		

	} // main method

} // class Ex2
