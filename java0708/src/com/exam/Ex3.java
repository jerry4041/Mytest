package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		
		aa:
		for (int i=0; i<3; i++) { // 3행
			for (int j=0; j<5; j++) { // 5열
				if (j == 2) {
					break aa;
				}
				System.out.print('*');
			} // inner loop
			System.out.println();
		} // outer loop
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //main method 

}
