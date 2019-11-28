package com.exam;

public class TV {
	String make;
	int year;
	int inch;
	
	TV() {
		
	}
	
	TV(String _make, int _year, int _inch) {
		make = _make;
		year = _year;
		inch = _inch;
	}
	
	void show() {
		System.out.println(make + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
