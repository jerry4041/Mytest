package com.exam2;

import com.exam.Ex6;
import com.exam.Point2D;

public class Exam1 {

	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		        // Point2D 클래스는 package(디폴트)로 선언됨
		        // 다른패키지인 com.exam2.Exam1에서는
//		Point2D // com.exam.Point2D는 접근 불가!
		
		
		Point2D p;
		p = new Point2D();
		
//		p.x = 10; 
		            // 접근지정자 생략(패키지)요소는
		            // 패키지 안에서만 공개되므로
//		p.setX(10); // 다른패키지에서는 접근불가
	}

}
