package com.exam;

public class Ex4 {

	public static void main(String[] args) {
		// 변수, 배열 - 주기억장치(RAM)
		// 연산자, 제어문 - 중앙처리장치(CPU)

		int a1, a2, a3, a4, a5; // 선언, 기억장소확보
//		System.out.println("a1 = " + a1); // 출력이 안됨
		
		a1 = 0; // 초기화로 초기값 설정해야만 사용가능
		a2 = 0;
		a3 = 0;
		a4 = 0;
		a5 = 0;
		
		a1 = a2 = a3 = a4 = a5 = 0;
		System.out.println("a1 = " + a1);
		
		// 배열: 같은 자료형의 기억장소를 여러개 사용
		// 		 배열은 객체이다.
		
		int[] a; // 정수형 배열을 참조하는 참조변수 선언
		String str;
		
		// 배열객체 생성 -> 객체는 기본값으로 초기화됨
		a = new int[5]; // 고정크기
		
		// 객체의 기본값(초기값)
		// 정수형 0	 0L		실수형 0.0	0.0f
		// 논리형 false		참조형 null
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		System.out.println("a[2] = " + a[2]);
		System.out.println("a[3] = " + a[3]);
		System.out.println("a[4] = " + a[4]);
	
		System.out.println();
		
		for (int i=0; i<=4; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		System.out.println();
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		for (int i=0; i<=4; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		System.out.println();
		
		int[] b = new int[10]; // 기본값으로 설정
		
		// 배열선언과 동시에 초기화
		int[] c = {1, 2, 3, 4, 5};
//		c = new int[] {10, 20, 30};
//		c = {10, 20, 30}; // 수정이 불가능
		
		int[] d = new int[] {10, 20, 30, 40, 50};
		d = new int[] {1, 2, 3}; // 수정이 가능
		
		// 배열크기: 배열변수명.length
		System.out.println("b의 배열크기: " + b.length);
		System.out.println("c의 배열크기: " + c.length);
		System.out.println("d의 배열크기: " + d.length);
		
		// c 배열내용 출력
		for (int i=0; i < c.length; i++) {
			System.out.println("c["+i+"] = " + c[i]);
		}
		
		for (int i=c.length-1; i >= 0; i--) {
			System.out.println("c["+i+"] = " + c[i]);
		}
		
		// for-each문
		for (int num : c) {
			System.out.println("num = " + num);
		}
		
		
		// 실수형 배열 선언 dArr 크기 4
		double[] dArr = new double[4];
		System.out.println("dArr[0] = " + dArr[0]);
		
		dArr[0] = 3.14;
		
		// 배열 리터럴로 수정
		dArr = new double[] {1.1, 2.2, 3.3, 4.4};
		
		for(double dNum : dArr) {
			System.out.println(dNum);
		}
		System.out.println();
		
		// 문자열 String배열 선언 strArr 크기 4
		String[] strArr = new String[4]; //인덱스 범위 0~3
		// 인덱스 0번째에 "홍길동" 저장
		strArr[0] = "홍길동";
		// 인덱스 1번째에 "성춘향" 저장
		strArr[1] = "성춘향";
		// 인덱스 2번째에 "이몽룡" 저장
		strArr[2] = "이몽룡";
		// 인덱스 0번째부터 3번째까지 배열요소 모두 출력
		
//		strArr = new String[] {"홍길동", "성춘향", "이몽룡"};
		
		// -> String 참조변수의 기본값은 null
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println();

//		for(String sName : strArr) {
//			System.out.println(sName);
//		}
		
		// 불리언형 배열 선언 boolArr 크기 3
		boolean[] boolArr = new boolean[3];
		// 인덱스 0번째에 true 저장
		boolArr[0] = true;
		// 인덱스 1번째에 true 저장
		boolArr[1] = true;
//		boolArr = new boolean[] {true, true};
		// 배열요소 모두 출력
		// -> boolean형의 기본값은 false
		
		for (boolean bool : boolArr) {
			System.out.println(bool);
		}
//		} // for each문
		
//		for (int i = 0; i<boolArr.length; i++) {
//			System.out.println(boolArr[i]);
//		}
//		
		String[] strArr2 = {"하나", "둘", "셋", null};
		System.out.println(strArr2.length);
		
		boolean[] boolArr2 = {false, false, false};
		
		char[] charArr2 = {'가', '나', '다'}; 
		
		char[] charArr3 = new char[5];
		System.out.println(charArr3[0]); // ' '
		
		
		
		
		
		

	} // main method

}
