package com.exam;

// static이 붙으면 객체구성요소가 아님!

class Tree { 
	// 필드(멤버 변수)
	String name;
	int age;
	// 메소드(함수)
	void wave() { // static이 붙지 않으면 객체의 구성요소가 된다
		System.out.println(age + "살 " + name + "(이)가 " + "바람에 흔들린다");
	}
} // class Tree


public class Ex4 {
	
	// 메인메소드 -> 시작메소드
	public static void main(String[] args) {
		// 변수 (한개 기억장소)
		// -> 배열 (같은자료형 기억장소 여러개)
		// -> 구조체 (다른자료형 기억장소 여러개)
		// -> 클래스 (구조체 + 함수)
		
		// 클래스: 객체 정의 (멤버변수 + 메소드)
		// 객체(인스턴스): 생성(기억장소 확보, 초기화), 사용
		
		// 클래스         객체(인스턴스)
		// 제품설계도     제품
		// TV설계도       TV
		// 붕어빵기계     붕어빵
		
		int a; // 변수 선언
		a = 0;
		
		int[] arr;  // 배열변수 선언
		arr = new int[5]; // new연산자로 배열객체 생성
		
		Tree tree; // 참조변수 선언
		tree = new Tree(); // new연산자로 Tree객체 생성
		// new : 객체생성 연산자. 객체생성후 기억장소 할당
		// tree : 객체의 주소를 저장하는 참조변수(레퍼런스)
		// . : 객체참조 연산자
		System.out.println(tree.name); // 출력 null
		System.out.println(tree.age); // 출력 0
		
		tree.name = "소나무";
		tree.age = 100;
		
		System.out.println(tree.name); // 소나무
		System.out.println(tree.age); // 100
		
		tree.wave(); // 100살 소나무(이)가 바람에 흔들린다
		
		Tree tree2 = new Tree();
		tree2.name = "대나무"; 
		tree2.age = 10; 
		
		System.out.println(tree2.name); // 대나무
		System.out.println(tree2.age); // 10
		
		tree2.wave(); // 10살 대나무(이)가 바람에 흔들린다
		
		
		
	} // main

} // class Ex4
