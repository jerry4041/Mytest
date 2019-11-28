package com.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 자바빈(Java Bean, 데이터객체)
// VO(Value Object, 값객체)
// Map 컬렉션과 비슷한 용도.
class Student {
	private int id;
	private String tel;

	public Student(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
	
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		// 해시맵 생성
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("검색할 이름은?");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("exit")) { // equalsIgnoreCase : 소문자 대문자 구분없이 
				break;
			}
			Student student = map.get(name);	
			
			if (student == null) {
				System.out.println(name + "은 없는 사람입니다.");
			} else {
				System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
			}
		}
		scanner.close();
	} // main method

}
