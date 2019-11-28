package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		/*
		for (int j=1; j<=3; j++) {
			for (int i=1; i<=5; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		*/
		
		for (int i=1; i<=3; i++) { // 행(row)
			for (int j=1; j<=5; j++) { // 열(column)
				System.out.println("i="+i+", j="+j);
			}
		}
		
		
		// 시계 (시 0~23, 분 0~59)
		// 0시 0분
		// 0시 1분
		// 0시 2분
		// ...
		// 0시 59분
		// 1시 0분
		// 1시 1분
		// ...
		// 23시 58분
		// 23시 59분
//		for (int hour=0; hour<24; hour++) {
//			for (int minute=0; minute<60; minute++) {
//				for (int second=0; second<60; second++) {
//					System.out.println(hour + "시 " 
//							       + minute + "분 "
//							       + second + "초");
//				}
//			}
//		}
		
		for(int i=2; i<20; i+=2) {
			System.out.println(i);
			
		}
	
	} // main

}

