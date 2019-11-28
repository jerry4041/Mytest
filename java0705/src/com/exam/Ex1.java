package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		
		// 이중for문 이용
		
		// for 출력 *5번출력
		/*
		 
		 ***** 
		 *****
		 *****
		 *****
		 *****
		 
		 */
		
		for (int r=1; r<=5; r++) { // 5행 >>>> (row)
			for (int c=1; c<=5; c++) { // 5열 ^^^^ (column)
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		
		*
		**
		***
		****
		*****
		
		*/
		
		for (int r=1; r<=5; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		/*
		2*1=2   2*2=4   2*3=6   ...   2*9=18
		3*1=3   3*2=6   3*3=9   ...   3*9=27
		...
		9*1=9   9*2=18  9*3=27  ...   9*9=81
		*/
		
		for (int r=2; r<10; r++) { // 행. 단수
			for (int c=1; c<10; c++) { // 열. 곱하는수
				System.out.print(r + "*" + c + "=" + (r * c) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		2*1=2   3*1=3   4*1=4   ...   9*1=9
		2*2=4   3*2=6   4*2=8   ...   9*2=18
		...
		2*9=18  3*9=27  4*9=36  ...   9*9=81
		*/
		
		for (int r=1; r<10; r++) { 
			for (int c=2; c<10; c++) { 
				System.out.print(c + "*" + r + "=" + (c * r) + "\t");
			}
			System.out.println();
		}

	} // main method

}
