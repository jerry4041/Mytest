package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// while 반복문
		
//		초기식;
//		while (조건식 ) {
//			반복실행할문장;
//			증감식;
//		}
		
//		1~10 출력
		
		// break문 : 가장 가까운반복문 블록을 빠져나옴
		int i = 1; // 초기식
		while (i <= 10) /* 조건식 */ { 
			if (i == 8) {
				break;
			}
			System.out.println("i = " + i);
			i++; // 증감식
		}
		System.out.println("=======================");
		// continue문 : 
		for (int j=1; j<=10; j++) {
			if (j == 8) {
				continue;
			}
			System.out.println("j = " + j); // 8일때 continue를 만나서 밑부분이 실행이 되지않는다 
		}
		System.out.println("=======================");
		// 1~10 출력하는중에 continue 이용해서
		// 2의배수(짝수)는 출력하지 않기
		
		for(int a = 1; a<=10; a++) {
			if (a % 2 == 0) {
				continue;
			}
			System.out.println("a = " + a);
		}
		System.out.println("=======================");
		
		
		// do-while문: 첫번째 반복은 수행이 보장되는 반복문
//		do {
//			반복실행할문장;
//		} while (조건식);
		
		// 숙제 다했는지 여부
		boolean isHomeworkFinished = true;
		
		i = 0;
		while (!isHomeworkFinished) { // isHomeworkFinished = false
			if (i == 3) {
				break;
			}
			System.out.println("맞자~!");
			i++;
		}
		System.out.println("=======================");

		
		i = 0;
		do { // isHomeworkFinished = false
			if (i == 3) {
				break;
			}
			System.out.println("맞자~!");
			i++;
		} while (!isHomeworkFinished);
	
	
	
	
	
	
	
	
	
	} // main method

}
