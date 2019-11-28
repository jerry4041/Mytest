package com.exam;

// 클래스 정의 Book
class Book {
//	책제목 문자열 title
	String title;
//	책가격 정수형 price
	int price;
//	책개수 정수형 num
	int num;

//	책금액총합 메소드
//		정수형리턴 sum()
//			책가격 * 재고수
	int sum() {
		return (price * num);
	}
} // class Book

public class Ex1 {

	public static void main(String[] args) {
		// Book 사용 -> 객체생성 후 사용한다는 의미

		Book book1 = new Book();
		
		// 출력 "책제목: java 가격: 1000 재고수: 30"
		// "책금액합계: 30000"

		book1.title = "java";
		book1.price = 1000;
		book1.num = 30;
		System.out.println("책제목: " + book1.title 
				+ " 가격: " + book1.price 
				+ " 재고수: " + book1.num);
		System.out.println("책금액합계: " + book1.sum());

		// 출력 "책제목: html 가격: 2000 재고수: 20"
		// "책금액합계: 40000"

		book1.title = "html";
		book1.price = 2000;
		book1.num = 20;
		System.out.println("책제목: " + book1.title 
				+ " 가격: " + book1.price 
				+ " 재고수: " + book1.num);
		System.out.println("책금액합계: " + book1.sum());

	} // main method
} // class Ex1
