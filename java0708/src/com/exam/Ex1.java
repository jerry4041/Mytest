package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// 배열 점수  scores  100 90 80 70 68
				
				
				int [] scores = { 100, 90, 80, 70, 68 };
				
				int sum = 0;  // 과목 합계점수
				double avg = 0;  // 과목 평균점수
				
				// for문 for-each문 이용
				
//				for (int i=0; i<scores.length; i++) {
//					sum += scores[i];
//					avg = (double)sum/scores.length;
//				}
//				System.out.println("sum: " + sum);
//				System.out.println("avg: " + avg);
				
				// for-each문 이용
				for (int s : scores) {
					sum += s;
					avg = (double)sum/scores.length;
				}
				System.out.println("합계는 " + sum);
				System.out.println("평균은 " + avg);
				
				
				// 정수형 10개 임의수 배열 num
		        // 79 88 91 33 100 55 95 81 75 64
		        int [] num = { 79, 88, 91, 33, 100, 
		        		      55, 95, 81, 75, 64 };
				
		        int evenCount = 0; // 짝수개수
		        int oddCount = 0;  // 홀수개수
		        int evenSum = 0;   // 짝수 합
		        int oddSum = 0;    // 홀수 합
		        
//		        for (int n : num) {
//		        	if (n%2 == 1) {
//		        		oddCount++;
//		        		oddSum += n;
//		        	} else {
//		        		evenCount++;
//		        		evenSum += n;
//		        	}
//		        }
		        // 짝수 개수:
		        // 홀수 개수:
		        System.out.println("짝수 개수: " + evenCount);
		        System.out.println("홀수 개수: " + oddCount);
		        System.out.println("짝수 합: " + evenSum);
		        System.out.println("홀수 합: " + oddSum);
		        
		        
		       // 변수값 서로 교환(바꾸기)
		        int a = 10; // a -> 20
		        int b = 20; // b -> 10
		        int temp =0; // 임시변수(잠시 저장하는 변수)
		        
		        temp = a;
		        a = b;
		        b = temp;
		        System.out.println("a = " + a);
		        System.out.println("b = " + b);
		        
		        
				
	} // main method 

}
