package com.exam;

public class Ex1 {
	
	public static void main(String[] args) {
		// 리터럴(literal) : 값  5   3.14   'A'  true  "문자열"
		// 변수 : 기억장소
		// 변수 선언 (자료형지정  이름)
		int a; // 4바이트 크기의 정수형 기억장소 확보, 이름 a로 정함
//		System.out.println("a=" + a); // 변수값 초기화 없이 사용하면 에러!
		
		a = 5; // 오른쪽 값을 왼쪽 변수공간에 저장(대입)
		System.out.println("a=" + a);  // "a=5"
		
		a = 10;
		System.out.println("a=" + a);
		
		a = a + 20;
		System.out.println("a=" + a);
		
		
		/*
		bit  0 또는 1 한개 
		byte  1비트 8개 모여서 1byte가 됨. 01010101
		
		[기본자료형]
		  정수형   byte(1)  short(2)  int(4)기본    long(8)
		       -128~127           -21억~21억
		  문자형  : 한개의 문자 (컴퓨터내부 정수저장)
		       char(2)  0~65536   16bit  유니코드
		  실수형 : 소수점 있는 수   (소수점 이하 자리수 정밀도에 따라 나눔)
		       float(4)   double(8)기본 
		  논리형 : true  false 저장
		       boolean (1비트)
		 
		[참조자료형(레퍼런스형)] - 클래스, 인터페이스, 배열
		 
		*/
		
		byte b; // 변수 선언
		b = 127; // 변수의 초기화
//		b = 128; // 크기범위 넘는값 저장 -> 에러
		
		long c;
		c = 35L;
		
		c = 10_000_000_000L;
		
		float d;
		d = 3.14f;
		
		double e;
		e = 3.1417;
		
		char ch;
		ch = 'A'; // 작은따옴표로 문자 한개 표현
//		ch = "A";
//		ch = 'AA';
		System.out.println(ch);
		
		int num = 'A';
		System.out.println(num); // 65
		
		boolean f;
		f = true;
		f = false;
		System.out.println(f);
		
		System.out.println(5 + 'A' + "\"문자열\"" + 3.4 + true + f);
		
		
		int g; // g 변수 선언
		//System.out.println(g);
		// 초기화(기억장소 값할당)되지 않으면 사용 못함!
		// h = 10; // 변수는 선언한뒤에 사용해야 함.
		
		
		int count = 5;
		count = count - 2; // 3
		count = count + 10; // 13
		System.out.println("연필이 \t필통에  " + count + "자루 있다.");
		
		
		// 출력 특수문자 리터럴(이스케이프 문자)
		// \"  \'   \\   \n   \t
		
		// 실수형 변수 pi 선언, 3.14 값 저장 (원주율)
		double pi = 3.14;
		// 정수형 변수 r 선언, 4 값 저장 (반지름)
		int r = 4;
		// 실수형 변수 area 선언, r*r*pi 수식 계산결과 저장 (원의 면적)
		double area = r * r * pi;
		// 콘솔출력
		// "반지름"이 ..인 
		//       \원의 면적\은 ..이다.
		System.out.println("\"반지름\"이 " + r + "인\n\t\\원의 면적\\은 " + area + "이다.");
	}

}

