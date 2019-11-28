package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		Point P = new Point();
		P.printPoint();
		P.setX(10);
		P.setY(20);
		P.setZ(30);
		System.out.println(P.getX());
		System.out.println(P.getY());
		System.out.println(P.getZ());
		
		Point p2 = new Point(100, 200, 300);
		p2.printPoint();
	} // main

}
