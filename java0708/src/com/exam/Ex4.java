package com.exam;

public class Ex4 {
	
	public static void main(String[] args) {
		// 2차원 배열: 같은 자료형의 기억장소 여러개 사용
		//  생성 -> 기억장소 확보, 기본값으로 초기화됨
				
		//  자료형[][]  배열변수이름;
		int[][] a = new int[5][3]; // 5행3열
		
		System.out.println("a[0][0] = " + a[0][0]);
		
		a[0][0] = 10;   a[0][1] = 20;   a[0][2] = 30;
		a[1][0] = 40;   a[1][1] = 50;   a[1][2] = 60;
		a[2][0] = 70;   a[2][1] = 80;   a[2][2] = 90;
		a[3][0] = 100;  a[3][1] = 110;  a[3][2] = 120;
		a[4][0] = 130;  a[4][1] = 140;  a[4][2] = 150;
		
		for (int r=0; r<5; r++) { // 행 0~4 학생
			for (int c=0; c<3; c++) { // 열 0~2 교과목점수
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		
		// 3행 2열
		int[][] b = { {10, 20}, 
					  {30, 40}, 
					  {50, 60} };
		
		System.out.println("행의갯수: " + b.length); // 3
		System.out.println("열의갯수: " + b[0].length); // 2
		
		for (int r=0; r<b.length; r++) { //행
			for (int c=0; c<b[0].length; c++) { //열
				System.out.print(b[r][c] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	} // main method
}
