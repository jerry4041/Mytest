package com.exam;

import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) {
		String str = "Java";  // 객체 1개
		str += "Programming"; // 앞의 객체 1개(가비지) + 프로그래밍이 붙은 객체 1개
		
		// StringBuffer : 가변크기의 버퍼를 가짐.
		// 		객체 자신의 문자열값 수정 가능.
		StringBuffer sb = new StringBuffer();
		sb.append("Java"); // 뒷부분에 추가
//		System.out.println(sb.toString());
		System.out.println(sb); // 출력값이 위와 같다
		sb.append(" Programming");
		System.out.println(sb);
		
		sb.replace(0, 4, "JSP"); // 시작과 끝 앞까지 문자열 바꿈
		System.out.println(sb);
		
		sb.insert(3, ",");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("===================");
		
		// StringTokenizer : 문자열을 분리하기 위해 사용. 
		//   String클래스의 split() 메소드와 동일한 기능.
		
		String strFruits = "사과#배#감#포도";
		
		StringTokenizer st = new StringTokenizer(strFruits,"#");
		// 토큰(Token)
		// 구분문자(Delimiter)
		
		System.out.println(st.countTokens()); // 토큰개수 : 4
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println(st.countTokens()); // 토큰개수 : 0, 재활용이 안됨
		
		System.out.println("===================");
		
		String query = "name=gildong&addr=busan&age=27";
		// &, = 두가지다 구분문자로 사용
		StringTokenizer st2 = new StringTokenizer(query, "&="); 
		System.out.println(st2.countTokens());
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
	} // main method

} // Ex5 class
