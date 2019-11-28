package com.exam;

class Baby {
	static int totalCount = 0;
	// static(정적) 초기화 블럭
	static {
		// 실행문....
	}
	// ============================
	int age = 0;

	public Baby() {
		totalCount++;
		age++;
	}
} // class Baby

public class Ex2 {

	public static void main(String[] args) {
		// totalCount 출력
		System.out.println("Baby.totalCount=" + Baby.totalCount);
		System.out.println();
		// 객체생성
		Baby baby1 = new Baby();
		System.out.println("Baby.totalCount=" + Baby.totalCount);//1
		System.out.println("baby1.age=" + baby1.age);//1
		System.out.println();
		// 객체생성
		Baby baby2 = new Baby();
		System.out.println("Baby.totalCount=" + Baby.totalCount);//2
		System.out.println("baby2.age=" + baby2.age);//1
		System.out.println();
		// 객체생성
		Baby baby3 = new Baby();
		System.out.println("Baby.totalCount=" + Baby.totalCount);//3
		System.out.println("baby3.age=" + baby3.age);//1
		System.out.println();
		
		Baby[] babies = new Baby[10];
		
		for(int i=0; i<babies.length; i++) {
			babies[i] = new Baby();
		}
		
		
		
		
		
	} // main method

}
