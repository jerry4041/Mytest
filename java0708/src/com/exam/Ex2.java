package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		// 정수형 10개 임의수 배열 num
        // 79 88 91 33 100 55 95 81 75 64
        int [] num = { 79, 88, 91, 33, 100, 
        		      55, 95, 81, 75, 64 };
        
        // 배열 요소에서 최대값 구하기
        int max = num[0];
        for (int i=1; i<num.length; i++) {
        	if (max < num[i]) {
        		max = num[i];
        	}
        }
        System.out.println("num배열 최대값: " + max);
        
        // 배열 요소에서 최대값 구하기
        int min = num[0]; // 배열 첫번째값으로 초기화
        for (int i=1; i<num.length; i++) {
        	if (min > num[i]) {
        		min = num[i];
        	}
        }
        System.out.println("num배열 최소값: " + min);
        
        System.out.println("=================================");
        
        for (int n : num) {
        	System.out.print(n + " ");
        }
        System.out.println();
        
        int temp =0; // 임시변수(잠시 저장하는 변수)
        // num[0]이 최대값. 기준이  num[0]이 됨.
        for (int i=1; i<num.length; i++) {
        	if (num[0] < num[i]) {
        		// 현재값보다 큰값 발견하면 맞바꾸기
        		temp = num[0];
        		num[0] = num[i];
        		num[i] = temp;
        	}
        }
        //출력
        for (int n : num) {
        	System.out.print(n + " ");
        }
        System.out.println();
        
        // num[1]이 최대값. 기준이  num[1]이 됨.
        for (int i=2; i<num.length; i++) {
        	if (num[1] < num[i]) {
        		// 현재값보다 큰값 발견하면 맞바꾸기
        		temp = num[1];
        		num[1] = num[i];
        		num[i] = temp;
        	}
        }
        //출력
        for (int n : num) {
        	System.out.print(n + " ");
        }
        System.out.println();
        
        
        // 내림차순 
        temp = 0;
        
        for (int gijun=0; gijun < num.length; gijun++) {
        	// 기분인덱스 다음요소부터 카운트
        	for (int i=gijun+1; i<num.length; i++) {
        		if (num[gijun] < num[i]) {
        			//최대값 맞바꾸기
        			temp = num[gijun];
        			num[gijun] = num[i];
        			num[i] = temp;
        		}
        	}
        }
        //출력
        for (int n : num) {
        	System.out.print(n + " ");
        }
        System.out.println();
        
        // 오름차순
        for (int gijun=0; gijun < num.length; gijun++) {
        	// 기본인덱스 다음요소부터 카운트
        	for (int i=gijun+1; i<num.length; i++) {
        		if (num[gijun] > num[i]) {
        			//최대값 맞바꾸기
        			temp = num[gijun];
        			num[gijun] = num[i];
        			num[i] = temp;
        		}
        	}
        }
        //출력
        for (int n : num) {
        	System.out.print(n + " ");
        }
        System.out.println();
	} // main method

}
