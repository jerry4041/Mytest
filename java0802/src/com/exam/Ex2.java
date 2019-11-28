package com.exam;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		// 컬렉션 : 자료구조, 저장공간
		// Set : HashSet 순서없는 여러타입 저장공간.
		//		 저장순서 없음 -> 중복저장 불가능.
		// List : ArrayList, Vector
		//		 순서있는 여러타입 저장공간.
		//		 저장순서 있음 -> 중복저장 가능.		
		// Map : HashMap, Hashtable 
		// 		 (키, 값) 쌍으로 저장,
		//		 키를 이용해서 값을 얻는 자료구조.

		Set set = new HashSet(); // 요소 E를 생략하면 Object타입으로 저장 업캐스팅
		
		System.out.println(set.isEmpty()); // true
		
		set.add("하나");
		set.add(1); // set.add(Integer.valueOf(1)); // 자동으로 Integer 객체형으로 바꿔준다 (오토박싱) 
		set.add(2.5);
		set.add('삼');
		set.add(2.5); // 중복되는 것이 있어도 하나만 출력
		System.out.println(set); // set.toString();
		
		System.out.println(set.isEmpty()); // false
		
		set.remove(2.5);
		System.out.println(set);
		set.remove("하나");
		System.out.println(set);
		
		System.out.println(set.size()); // 요소 개수 2
		
		System.out.println("contains: " + set.contains(1)); // true
		
		set.clear(); // 앞의 객체를 다시 재사용 
					 // 성능면에서는 다시 객체를 만들어 사용 하는 것과는 차이 없음(앞의 객체는 가비지)
		System.out.println(set.size()); // 요소 개수 0
		System.out.println(set);
		
		
	} // main method

} // Ex2 class
