package com.exam;

import java.awt.Toolkit;
import java.util.Scanner;

public class NumberGame {			

	public static void main(String[] args) {
		System.out.println("==숫자 맞추기 게임==");
		
		Scanner scanner = new Scanner(System.in); 
		
		int comNum = (int) (Math.random() * 4) + 6; //1단계
		//Math Random()		0.0 ~ 0.99999
		//Math Random()		0.0 ~ 3.ooooo
		//(int) (Math.random() * 4)	 	0 ~ 3
		//(int) (Math.random() * 4) + 6		6 ~ 9
		
		if (comNum % 2 == 0) {
			System.out.println(" Hint : 컴퓨터는 짝수");
		} else {
			System.out.println(" Hint : 컴퓨터는 홀수"); 
		} //2단계
		System.out.println(" 숫자를 입력하세요");
		
		System.out.print(" 사용자 >> ");
		int userNum = scanner.nextInt();
		
		System.out.println(" 컴퓨터 >> " + comNum );
		
		System.out.println(" 입력값:" +userNum + " 컴퓨터값:" + comNum );
		
		if (userNum == comNum ) {
			System.out.println(" 맞췄습니다!!");
		} else if (userNum > 9 || userNum < 6) { 
			System.out.println(" 숫자를 다시 입력하세요");
		} else {
			System.out.println(" 실패...");
		}
			
		
		
		// 숫자 맞추기 게임
		/*
		
		1단계 : 6,7,8,9 중 임의의 정수를 생성하고
		생성된 정수를 사람이 맞추는 게임.
		
		2단계 : 짝수인지 홀수인지 힌트주기
			짝수면 "짝수입니다"
			홀수면 "홀수입니다"
		
		3단계 : 사용자 입력 숫자값 받기
		
		4단계 : 사용자 입력값과 컴퓨터 값을 비교 후 출력
			
			출력 "입력값: 9, 컴퓨터값: 8"
			
			결과 메시지 출력
			 일치하면 "맞췄습니다!!"
			 다르면 "실패..."
			
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
	} // main method

}
