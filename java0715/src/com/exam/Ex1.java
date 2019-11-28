package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// 객체 생성
		Point p = new Point();
//		System.out.println(p.x); // 2
//		System.out.println(p.y); // 2
//		p.printData(); // 2, 2
		
		
		// private 필드는 대입연산자 사용 불가능
//		p.x = 10;
//		p.y = 20;
//		p.printData(); // 10, 20 << 실무에서 대입연산자를 사용하는 스타일은 하지않는다 
		
		// p 객체에 x와 y값을 수정
		p.setX(100); // p.x = 100;
		p.setY(200); // p.y = 200;
		p.printData();
		
//		System.out.println(p.x);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		System.out.println("=========================");
		
		Point p2 = new Point(300);
		p2.printData(); // 300, 0
		
		Point p3 = new Point(300, 400);
		p3.printData(); // 300, 400
		
	} // main method

} // class Ex1
