package a.b;

import a.AccessEx;

public class SubAccessEx extends AccessEx {
	
	void subPrintField() {
		System.out.println("SubAccessEx - subPrintField()");
		//System.out.println("a = " + a); // 접근지정자 private
		//System.out.println("b = " + b); // 접근지정자 생략(package)
		System.out.println("c = " + c); // protected 다른패키지에서 상속관계의 자식클래스
		System.out.println("d = " + d); // public 
	}

}