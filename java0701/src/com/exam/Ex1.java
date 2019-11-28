package com.exam;

public class Ex1 {

	public static void main(String[] args) {
		// 논리연산자	&& (and)	|| (or)	! (not)
		// -> 비교연산자가 적용된 수식의 결과값을 가지고
        //	  최종 논리판단을 하는 연산자
		
		int a =10, b =20;
		
		System.out.println("!true = " + !true);
		
		System.out.println("!(a > b) = " + !(a > b)); //예를 들면 오늘 비가 안오면 부정적인 의미로 ! 사용
		
		// && (and)	그리고, ~이고, ~이면서 // 로그인 작업에서 성공시 // 어느 한쪽이 거짓이면 결과는 거짓으로 출력된다
		// true && true -> true 
		System.out.println(a<b && a!=b); // true
		// true && false -> false
		System.out.println(a<b && a==b); // false
		// false && true -> false
		System.out.println(a>b && a!=b); // false
		// false && false -> false
		System.out.println(a>b && a==b); // false
		
		
		// || (or) 또는, ~이거나 // 로그인 작업에서 실패시 // 어느 한쪽이 참이면 결과는 참으로 출력된다
		// true || true -> true
		System.out.println(a<b || a!=b); // true
		// true || false -> true
		System.out.println(a<b || a==b); // true
		// false || true -> true
		System.out.println(a>b || a!=b); // true
		// false || false -> false
		System.out.println(a>b || a==b); // false
		
		
		
		
		int age = 15;
		String str = "";
		// 10~19	10 <= age <= 19 // 표현할수없다
		//		10 <= age && age <= 19 // 두개의 수식으로 분리해주어야 한다
		//		age >= 10 && age <= 19 
		str = (age >= 10 && age <= 19) ? "10대" : "10대아님";
		System.out.println(age + "세 -> " + str);
		
		int jumin = 4; // 1남 2여 3남 4여
		str = (jumin == 2 || jumin == 4 ) ? "여" : "남";
		System.out.println(jumin + " -> " +str);
		
		// true && true && true -> true // 처음부터 끝까지 확인한다
		// false || false || false -> false 
		// false || true || false -> true // true가 나올 수식을 앞에 쓰면 빨리 출력된다 
		// && 과 || 수식중에 &&수식을 먼저 한다
		
		int kor=85, eng=80, math=40; // 국영수 과목 점수
		int sum = kor+eng+math; // 합계
		double avg = sum / 3.0; //평균 = 합계 / 과목수
		
		// 평균 소수점 이하 둘째자리까지 구하는 수식
		// 평균의 100곱하기 -> (정수형변환) -> 100나누기
		
		// 68.3333333333333 처음값
		// 6833.33333333333 평균의 100곱하기 결과
		// 6833 정수형변환
		// 68.33 실수나눗셈으로 100나누기 결과
		
		avg = (int)(avg * 100) / 100.0;  
		
		System.out.println("국어:" + kor + ", 영어:" + eng + ", 수학:" + math);
		System.out.println("합계:" + sum + ", 평균:" + avg);
		
		
		//출력 국어:	영어:	수학:
		//	   합계:	평균:	
	
		// 평균이 60점 이상이고 각 과목이 40점 이상이면
		// "합격", 아니면 "불합격"
		str = (avg >= 60) 
				&& (kor >= 40) 
				&& (eng >= 40) 
				&& (math >= 40) ? "합격" : "불합격";
		System.out.println("결과:" + str);
		
		
		
		
		
	} //main method

}
