package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// 1차원배열 정수형 arr 10 20 30 40 50
		int[] arr = {10, 20, 30, 40, 50};
		
		// 배열내용 출력 메소드호출 -> 출력 "10 20 30 40 50"
		printArr(arr);
		
		System.out.println("배열의 합: " + sumArr(arr)[0]);
		
		System.out.println("배열의 평균: " + sumArr(arr)[1]);
		
	} // main
	
	public static void printArr(int[] arr) {
		System.out.print("출력:");
		for(int num : arr) {
			System.out.print(num + " ");
		} 
		System.out.println();
		}// printArr method	
	
	public static int[] sumArr(int[] arr) {
		int[] result = new int[2];
		for(int i : arr) {
			result[0] = result[0] + i;
		}
		/*
		 * for(int j=0; j<arr.length; j++) { 
		 * result[0] += arr[j]; }
		 */
		result[1] = result[0] / arr.length;
		return result;
	}
	
	
	
} // class
