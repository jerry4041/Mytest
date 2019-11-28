package com.exam;

public class Ex6 {

	public static void main(String[] args) {
		// 접근 지정자
		// public : 모두 접근가능
		// protected : 같은 패키지 안에서만 접근가능. 
		// 			   다른 패키지에서는 상속받는 자식클래스에게만 접근허용.	
		// 생략(package) : 같은 패키지 안에서만 접근가능
		// private : 객체 외부에는 비공개. 객체 안에서만 사용가능.
		
		Point2D p = new Point2D();
//		p.x = 10; // private 요소는 객체 외부에서 접근불가!
		p.setX(10);
		p.setY(20);
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.printPoint();
	} // main method

}
