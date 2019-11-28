package com.exam;

public class Ex5 {

	public static void main(String[] args) {
		
		// 비정방형 배열
		
		// 2차원배열 정수형 num {1,2} {3,4} {5,6,7}
		
		int[][] num = { { 1, 2 }, 
						{ 3, 4 }, 
						{ 5, 6, 7 } };
		
		// 출력
		
		for (int r=0; r<num.length; r++) { // 행
			for (int c=0; c<num[r].length; c++) {
				System.out.print(num[r][c] + "\t");
			}
			System.out.println();
		}
		
		// 2차원배열 문자열 names
		// {"홍길동", "이순신"} {"유관순"}
		
		String[][] names = {{"홍길동", "이순신"}, 
							{"유관순"}};
		
		// 출력
		
		for (int r=0; r<names.length; r++) { // 행
			for (int c=0; c<names[r].length; c++) { // 열
				System.out.print(names[r][c] + "\t");
			}
			System.out.println();
		}
		
		// 비정방형 배열 new로 만들기
				// String배열  -> 각 요소가 null로 초기화
				names = new String[2][];
				
				names[0] = new String [2];
				names[1] = new String [1];
				
		// 출력
		
		for (int r=0; r<names.length; r++) { // 행
			for (int c=0; c<names[r].length; c++) { // 열
				System.out.print(names[r][c] + "\t");
			}
			System.out.println();
		}

			
		
		
		
		
		
		
		
		
		
		
	} // main method

}
