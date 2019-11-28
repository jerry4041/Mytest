package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		
			// 정수형 2차원 배열 scores
	        int[][] scores = { { 85, 60, 70  }, 
	                           { 90, 95, 80  }, 
	                           { 75, 80, 100 }, 
	                           { 80, 70, 95  }, 
	                           { 100, 65, 80 } };
	        
//	      1번학생: 85  60  70   총점   평균
//	      2번학생: 90  95  80
//	      3번학생: 75  80  100
//	      4번학생: 80  70  95
//	      5번학생: 100 65  80
	        int sum = 0;     // 총점
	        
	        double avg = 0;  // 평균
	       
	        for (int r=0; r<scores.length; r++) {
	        	System.out.print((r+1)+"번학생:");
	        	for (int c=0; c<scores[r].length; c++) {
	        		
	        		System.out.print(scores[r][c] + "\t");
	        		
	        		sum += scores[r][c];
	        		avg = (double)sum/scores[c].length;
	        	}
	        	System.out.println();
	        }
	        System.out.print(sum + "\t");
        	System.out.println(avg);
        	
        	
	        
	} // main method 

}
