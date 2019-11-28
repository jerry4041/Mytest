package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		// 무한반복 (=무한루프)
		
//		for (;true;) {
//			
//		}
		
//		for (;;) {
//			
//		}
		
//		while (true) {
//			
//		}
		
		// (1)+(-2)+(3)+(-4)+(5)+(-6)+...+(-10)+(11)+(-12)+...
				// 총합이 100 이상이면 반복문 빠져나와서 총합을 출력하기
				int sum = 0; // 총합
				for(int i=1; true; i++) {
					if(i % 2 == 1) {
						sum += i;
					} else {
						sum -= i;
					} if(sum >= 100) {
						break;
					}
						
				}
				System.out.println("총합은 " + sum);
//				int num = 0; // 부호 바뀐수 저장
//				int s = 1; // 부호
//				int n = 1; // 숫자
//				while (true) {
//					num = n * s;
//					sum = sum + num;
//					
//					if(sum >= 100) {
//					   break;
//					}
//					s = -s;
//					n++;
//				}
				
		
		
		

	} // main method

}
