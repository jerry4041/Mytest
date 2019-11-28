package com.exam;
// this 참조변수(레퍼런스)
// this.필드명
// 여기서 this는 객체 자신을 가리키는 참조변수

public class MyDate {
	int year; // 년
	int month; // 월
	int day; // 일

	MyDate() {
		year = 2019;
		month = 1;
		day = 1;
	}

	MyDate(int year) {
		this.year = year;
		month = 1;
		day = 1;
	}

	// 년,월 값을 받아서 초기화. 일은 1일로 설정
	MyDate(int year, int month) {
		this.year = year;
		this.month = month;
		this.day = 1;
	}

	// 년,월,일 값을 받아서 초기화
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}
	
	void printDate() {
		System.out.println(year + "-" + month + "-" + day);
	}

}
