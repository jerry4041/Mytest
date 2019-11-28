package com.exam;

public class Student { 
	// 학번 정수형 hakbun
	int hakbun;
	// 학생이름 문자열 name
	String name;
	// 국어점수 정수형 kor
	int kor;
	// 영어점수 정수형 eng
	int eng;
	// 수학점수 정수형 math
	int math;
	
	// 기본생성자 (디폴트 생성)
	public Student() {
		System.out.println("Student 생성자 호출됨.");
		// 60~100 사이의 임의의 값으로 점수 초기화
		kor = (int)(Math.random()*41) + 60;
		eng = (int)(Math.random()*41) + 60;
		math = (int)(Math.random()*41) + 60;
	}
	
	// 합계 구하는 리턴하는 메소드	(국어+영어+수학) 
	// 리턴_정수형 sum()
	int sum() {
		return (kor + eng + math);
	}
	// 평균 구해서 리턴하는 메소드	
	// 리턴_실수형 avg()
	double avg() {
//		return ((double)(kor + eng + math)/3);
		return sum() / 3.0;
	}
}
