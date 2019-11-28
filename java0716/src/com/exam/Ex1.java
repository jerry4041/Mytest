package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// 객체생성
		MyDate m = new MyDate();
		System.out.println(m.getYear()); // 2019
		System.out.println(m.getMonth());
		System.out.println(m.getDay());
		
		m.setYear(2020);
		m.setMonth(6);
		m.setDay(25);
		
		System.out.println(m.getYear()); // 2020
		System.out.println(m.getMonth());
		System.out.println(m.getDay());
		
		MyDate m2 = new MyDate(2020, 7, 7);
		m2.printDate();
		
		
		
	} // main method

} // class Ex1
