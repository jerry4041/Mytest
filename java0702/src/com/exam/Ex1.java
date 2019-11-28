package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// switch문 : 성능이 if문 보다 좋음
		
		// case 리터럴값:
		// -> 리터럴값의 타입은 int형, long형, char형, String형만 가능함
		
		// break문 : 자신을 감싸는 가장 가까운
		//           switch문 또는 반복문 블럭을 빠져나옴
		
//		switch (변수 또는 수식) {
//		case 값1: 명령문1; break;
//		case 값2: 명령문2; break;
//		case 값3: 명령문3; break;
//		default: 나머지명령문;
//		}
		
		// 1월 2화 3수 4목 5금 6토 7일
		int a = 7;
		char ch = ' ';
		if (a == 1) {
			ch = '월'; 
		} else if (a == 2) {
			ch = '화';
		} else if (a == 3) {
			ch = '수';
		} else if (a == 4) {
			ch = '목';
		} else if (a == 5) {
			ch = '금';
		} else if (a == 6) {
			ch = '토';
		} else if (a == 7) {
			ch = '일';
		}
		System.out.println(ch + "요일 입니다.");
		
		switch (a) {
		case 1: ch = '월'; break;
		case 2: ch = '화'; break;
		case 3: ch = '수'; break;
		case 4: ch = '목'; break;
		case 5: ch = '금'; break;
		case 6: ch = '토'; break;
		case 7: ch = '일'; break;
		}
		System.out.println(ch + "요일 입니다.");
		
		// 'A' -> "매우우수"
		// 'B' -> "우수"
		// 'C' -> "보통"
		// 'D' -> "미흡"
		// 'F' -> "매우미흡"
				
		
		char grade = 'F';
		switch (grade) { // grade == 'A' || grade == 'B'
		case 'A': 
			System.out.println("매우우수"); break;
		case 'B': 
			System.out.println("우수"); break;
		case 'C': 
			System.out.println("보통"); break;
		case 'D': 
			System.out.println("미흡"); break;
		case 'F': 
			System.out.println("매우미흡"); break;
		default:
			System.out.println("학점 아님"); break;
		}
		
		
		
		
		
		
		
		
		
		
	} // main method

}
