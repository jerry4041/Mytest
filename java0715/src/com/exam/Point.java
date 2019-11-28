package com.exam;

// 생성자 오버로딩(Overloading) : 생성자 여러개 정의

// 생성자 정의부는 생성된 객체의 구성요소로 포함안됨!

public class Point {
	// 필드(멤버변수) 정수형 x 정수형 y
	private int x, y; // private (캡슐화) 외부에서 수정 불가능 
	// 기본생성자 x와 y를 2로 초기화
	public Point() {
		x = y = 2;
	}
	// 정수값 받아서 x필드를 초기화
	public Point(int _x) {
		x = _x;
	}
	// 정수값 두개 받아서 x와 y 필드를 초기화
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	// x필드에 값 설정하는 setter 메서드 (쓰기)
	void setX(int _x) {
		if(_x < 0) {
			x = 0;
		} else {
			x = _x;
		}
		
	}
	
	// y필드에 값 설정하는 setter 메서드 (쓰기)
	void setY(int _y) {
		if(_y < 0) {
			y = 0;
		} else {
			y = _y;
		}
			
	}
	
	// x필드값 가져오기 getter 메서드 (읽기)
	int getX() {
		return x;
	}
	
	
	// x필드값 가져오기 getter 메서드 (읽기)
	int getY() {
		return y;
	}
		
	// 일반메서드 출력 "x, y"
	void printData() {
		System.out.println(x + ", " + y);
	}
	
}
	
