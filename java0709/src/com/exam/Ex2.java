package com.exam;

public class Ex2 {
	// 사용자 정의 메소드(함수) // y=f(x) // f라는 함수에 x라는 값을 넣으면 y가 출력된다
	// -> 자주 사용되는 코드들을 메소드로 정의함	
	// 	  코드 재사용 높이기 위해 정의
	
	/*
	  
	리턴할 자료형void 메소드 이름(매개변수) {
	 	자주 사용되는 명령문;
	 	...
	 	return 리턴값;
	}  
	  
	 */
	
	// 1) 입력매개변수 없음, 리턴값 없음
	public static void star() { 
		System.out.println("*****");
		System.out.println("*★★★*");
		System.out.println("*****");
	} 
	
	// 2) 입력매개변수 있음. 리턴값 없음
	public static void star2(int a) {
		System.out.println("받은값: " + a);
		System.out.println("*★★★*");
	}
	
	// 3) 입력매개변수 없음. 리턴값 있음
	public static String star3() {
		// return "방가~";
		String str = "방가~";
		return str;
	}
	
	// 4) 입력매개변수 있음. 리턴값 있음
	public static int star4(int a, int b) {
		star();
		int result = a + b; // result는 지역변수
		return result; // return문은 코드블럭 닫히기 직전에 나온다.
	}	
	
	// 메인메소드: 프로그램의 시작점 메소드
	public static void main(String[] args) {
		// 메소드(함수): 자주 사용되는 명령 정의
		// 	 필요시 메소드 이름 호출해서 사용함
		
		System.out.println(star4(10,20)); 
		// println 이라는 메소드 안에서 star4 메소드 실행 (star4 메소드 부터 실행)
		
		String str = star3();
		System.out.println("star3() 리턴값: " + str);
		
		star2(20);
		
		System.out.println("홍길동"); 
		star();
		System.out.println("성춘향");
		star();
		System.out.println("이몽룡");
		star();
		
		
	} // main method 

} // class
