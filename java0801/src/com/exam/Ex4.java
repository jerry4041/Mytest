package com.exam;

public class Ex4 {

	public static void main(String[] args) {
		// String 객체생성 = 불변객체(객체 내용이 변하지 않음)
		String str = "Java Programming";
		
		// String 메소드
		System.out.println(str.length()); // 트위터 글자수제한 등에 사용
		
		
//		str = null; // tip
		// 문자열 비교
		if ("Java Programming".equals(str)) {
			System.out.println("문자열 같음");
		}
		
		// 문자열 가져오기. 인덱스번호 0부터 시작함.
		System.out.println(str.charAt(5)); // P
		System.out.println(str.substring(5)); // 5번~마지막번호 문자열출력
		System.out.println(str.substring(5, 8)); // 5~(마지막번호-1) 문자열출력
		System.out.println("문자열 연결: "+str.concat("!!!")); 
		// 원본은 그대로 두고 새로운 문자열 만들어 리턴
		System.out.println("문자열 교체: "+str.replace("Java", "JSP")); 
		System.out.println("문자위치: "+str.indexOf('a')); // a가 찾아지는 최초의 인덱스번호
		System.out.println("문자위치: "+str.indexOf("gram")); // gram 단어가 최초 시작하는 위치
		System.out.println("문자위치: "+str.lastIndexOf("a")); // 역순으로 찾음
		System.out.println("문자열 포함여부: "+str.contains("grem")); // 문자열 없다
		System.out.println("대문자 변환: "+str.toUpperCase());
		System.out.println("소문자 변환: "+str.toLowerCase());
		
		String[] strArr = str.split(" "); // 문자열 분리해서 배열로 리턴
		System.out.println("문자열 분리: "+strArr[0]);
		
		System.out.println("==========================");
		
		// 주민번호 -> 남여구분 1,3 남 2,4 여
		String ju = "951220-4234567";
		
		// 성별구분문자 가져오기. charAt() substring()
//		int index = ju.indexOf('-');
//		char ch = ju.charAt(index+1);
		
		char ch = ju.charAt(ju.indexOf('-')+1);
		String s = ju.substring(7, 8);
		
		// if 비교 char == 		String  .equals()
		// 남여 출력
		if (ch =='1' || ch == '3') {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
		
		System.out.println("==========================");
		
		if (s.equals("1") || s.equals("3")) {
			System.out.println("남");
		} else {
			System.out.println("여");
		}
		
	} // main method

} // Ex4 class
