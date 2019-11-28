package com.exam;

public class Ex2 {
	
	public static void methodA(int a) {
		System.out.println("methodA에서 a 수정전: "+a);
		a = 11;
		System.out.println("methodA에서 a 수정후: "+a);
	} // methodA
	
	public static void methodB(int[] arr) {
		arr[0] = 11;
	} // methodB

	public static void main(String[] args) {
		int a = 10;
		methodA(a);
		System.out.println("a = " + a); // 출력결과 a = 10
		
		

		int[] arr = {10, 20, 30};
		methodB(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		// 출력결과 11 20 30
	} // main

}
