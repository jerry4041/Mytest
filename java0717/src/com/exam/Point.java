package com.exam;

public class Point {
	// 필드 정수형 x y z
	int x, y, z;
	
	// 기본생성자 -> x y z 를 받는 생성자 호출해서 1 1 1 로 초기화
	Point() {
		this(1, 1, 1);
	}

	// x y z 받아서 초기화하는 생성자
	Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	// setter / getter 메소드
	int getX() {
		return x;
	}

	void setX(int x) {
		this.x = x;
	}

	int getY() {
		return y;
	}

	void setY(int y) {
		this.y = y;
	}

	int getZ() {
		return z;
	}

	void setZ(int z) {
		this.z = z;
	}
	
	// printPoint() -> 출력 "x, y, z"
	void printPoint(){
		System.out.println(x + ", " + y + ", " + z);
	}
	
} // class Point
