package com.exam;

public class Ex3 {
	
	public static void hello() {
		System.out.println("Hello Java");
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	public static int abs(final int num) { // final
//		int result = 0; // 리턴할 변수
//		if (num < 0) {
//			result = -num;
//		} else { // num >= 0
//			result = num;
//		}
//		return result;
		
		return (num >= 0) ? num : -num ;
	}
	
	public static int myMax(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int mySum(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int[] sumArr(int[] arr) {
		// arr 이용해서 총합과 평균 구하기
		int[] result = new int[2]; // [0]총합  [1]평균
		
		for(int num : arr) {
			result[0] += num;  // 총합
		} 
		result[1] = result[0] / arr.length;// 평균
		
		return result;
	}

	public static void main(String[] args) {
		// hello() 호출 -> 출력 "Hello Java"
		hello();
		// sum(10, 20) -> 출력 "10 + 20 = 30" 
		sum(10, 20);
		// abs(-5) -> 절대값을 리턴
		System.out.println("-5의 절대값: " + abs(-5));
		// myMax(10, 20) -> 둘중에 큰값을 리턴
		System.out.println("10,20 중 큰값: " + myMax(10,20));
		// mySum(10) -> 1~10까지의 합을 리턴
		System.out.println("1~10까지의 합: " + mySum(10));
		
		// sumArr(정수배열전달) -> 합계를 리턴
		int[] arr = {80, 70, 68}; 
		
		int[] resultArr = sumArr(arr);
		
		System.out.println("총합: " + resultArr[0]);
		System.out.println("평균: " + resultArr[1]);
		
//		System.out.println(sumArr(arr));
		
	} // main method

}
