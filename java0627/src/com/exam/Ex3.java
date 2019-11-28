package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		// 기본자료형에서
		// 타입(자료형) 변환
		// -> 상호 호환관계 내에서는 형변환이 가능함.
		      // -> 숫자형(정수형, 실수형)
		
		// 같은 정수형 내에서는 바이트 크기가 기준.
		long l;
		l = 10;  // long형(8) = int형(4)
		// 작은쪽에서 큰쪽으로는 묵시적(자동) 형변환 일어남.
		System.out.println("l=" + l);
		
		int i;
		i = (int) 10L; // int형(4) = long형(8)
		// 큰쪽에서 작은쪽으로 대입연산자 사용시
		// 캐스팅(형변환) 연산자 사용해서 명시적(강제) 형변환 시킴
		System.out.println("i=" + i);
		
		l = 10_000_000_000L;
		i = (int) l;  // int형(4) = long형(8)
		System.out.println("i=" + i);
		
		
		// 같은 실수형 내에서는 바이트 크기가 기준.
		double d = 3.14f; // double형(8) = float형(4)
		// 묵시적 형변환
		System.out.println("d=" + d);
		
		float f = (float) 3.14156212345; // float형(4) = double형(8)
		// 명시적 형변환
		System.out.println("f=" + f);
		
		
		
		double dNum = 3E100;
		System.out.println("dNum = " + dNum);
		
		// 정수와 실수간의 형변환 -> 실수가 정수보다 항상 크다!
		long lNum = 27;  // 8바이트 크기
		float fNum;  // 4바이트 크기
		// 정수와 실수간에는 바이트 크기에 상관없이 실수가 항상 큼!
		fNum = lNum;  // float형(실수형) = long형(정수형)
		// 자동(묵시적) 형변환 일어남
		System.out.println("fNum = " + fNum);
		
		
		long lNum2;
		float fNum2 = 3.14f;
		
		lNum2 = (long) fNum2; // 정수(작음) = 실수(큼)
		// 수동(명시적) 형변환 해줘야 함
		System.out.println("lNum2 = " + lNum2);
		
		
		char ch = 'A';  // 65
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		
		
		ch = 'Z'; // 90
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		ch = 'a'; // 97
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		ch = 'z'; // 122
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		ch = '0'; // 48
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		ch = '!'; // 33
		System.out.printf("%c => %d\n", ch, (int)ch);
		
		ch = '가'; // 44032
		System.out.printf("%c => %d\n", ch, (int)ch);
		

		// 상수 (변하지 않고 항상 같은값을 가지는 변수)
				final int MY_ALPHA;
				MY_ALPHA = 20; // 초기화
//				MY_ALPHA = 50; // 수정 허용 X
				System.out.println("MY_ALPHA = " + MY_ALPHA);
				
				
				boolean b = true;
				String str = "안녕하세요~ 반갑습니다~~~~";
				char ch2 = '\b';
				System.out.println(ch2);
				
				String str2 = "";
				
				
//				final int YEAR = 365, MONTH = 30, WEEK = 7;
//				final int MONTH = 30;
//				final int WEEK = 7;
		
		
	    System.out.println((byte) (128 + 128) + (int) 22.9);
			
		
		
	} // main method

}

