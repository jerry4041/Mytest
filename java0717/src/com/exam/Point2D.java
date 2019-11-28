package com.exam;

public class Point2D {
	// 필드 정수형 x y
	private int x; // 데이터 은닉 -> 캡슐화
	private int y; // 데이터 은닉 -> 캡슐화
	// 기본생성자 -> x y 를 받는 생성자 호출해서 1 1 로 초기화.
	public Point2D() {
		this(1, 1);
	}
	// x y z 받아서 초기화하는 생성자
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// setter / getter 메소드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	// printPoint() -> 출력 "x, y, z"
	public void printPoint() {
		System.out.println(x+", "+y);
	}
} // class Point

