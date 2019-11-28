package com.exam;

public class Grade {
	
	private int math, science, english;
	
	Grade() {
		
	}
	
	Grade(int _math, int _science, int _english) {
		math = _math;
		science = _science;
		english = _english;
	}
	int average() {
		return (math + science + english)/3 ;
	}
	
}
