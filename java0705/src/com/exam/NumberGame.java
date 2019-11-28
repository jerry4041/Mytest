package com.exam;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
				// 숫자 맞추기 게임
				/*
				1단계 : 1~100 중 임의의 정수 생성(랜덤수)
				       생성된 정수를 사람이 맞추는 게임.
				       
				2단계 : 짝수인지 홀수인지 힌트 출력
				       짝수면 "힌트는 짝수입니다"
				       홀수면 "힌트는 홀수입니다"
				       
				3단계 : 사용자 입력 숫자값 받기  
				     	"맞출값을 입력하세요: "
				     	Scanner 객체준비 후  scanner.nextInt();
				     	입력받는 숫자가 1~100 사이가 아닐경우 재입력받기
				     
				4단계 : 사용자 입력값과 컴퓨터값을 비교 후
				     비교if  사용자값 > 컴퓨터값(맞춰야될값)
				               -> "더 작은값을 입력하세요."
				             사용자값 < 컴퓨터값(맞춰야될값)
				               -> "더 큰값을 입력하세요."
				             나머지 두 값이 같은 경우
				               -> "맞췄습니다."
				                  "시도횟수: 5회"
				                  반복문 빠져나오기
				*/
		
		System.out.println("==숫자 맞추기 게임==");
		
		Scanner scanner = new Scanner(System.in); 
		
		int comNum = (int) (Math.random() * 100) + 1; // 1단계
		//Math Random()		0.0 ~ 0.99999
		//Math Random()		0.0 ~ 99.ooooo
		//(int) (Math.random() * 4)	 	0 ~ 3 // Math 괄호는 중요하다
		//(int) (Math.random() * 4) + 6		6 ~ 9
		
	
		if (comNum % 2 == 0) {
			System.out.println("힌트는 짝수입니다");
		} else {
			System.out.println("힌트는 홀수입니다"); 
		}
		
		int userNum = 0;
		int count = 0;
		
		while(true) {
			System.out.print("\n맞출값을 입력하세요[1~100]: ");
			userNum = scanner.nextInt();
			count++; // 카운트 1증가
			if (userNum < 1 || userNum > 100) {
				System.out.println("범위에 벗어납니다");
				continue;
			} if (userNum > comNum) {
				System.out.println("더 작은값을 입력하세요");
				continue;
			} else if (userNum < comNum) { 
				System.out.println("더 큰값을 입력하세요");
				continue;
			} else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수:" + count);
				break;
			}
		}
		
		scanner.close();
				

	} // main method 

}
