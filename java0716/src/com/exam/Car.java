package com.exam;

//this(); - this() 생성자 호출

//생성자가 오버로딩(중복정의)되있을때
//코드를 간결하게 만드는 용도로 사용함.

public class Car {
	// 필드
	//   문자열 color
	//   문자열 gearType   "auto" / "manual"
	//   정수형 doorCount
	String color;
	String gearType;
	int doorCount;
	
	// 기본생성자
	//   초기값  color="white" gearType="auto"
	//           doorCount=4
	Car() {
		// 다른생성자한테 초기화작업 떠넘기기
		// this()호출은 생성자블록 안에서 가장 먼저 호출되어야함!
		this("white", "auto,", 4);
	
//		this.color = "white";
//		this.gearType = "auto";
//		this.doorCount = 4;
	}
	// color 받아 초기화하는 생성자
	Car(String color) {
		this(color, "auto", 4);
//		this.color = color;
//		this.gearType = "auto";
//		this.doorCount = 4;
	}
	// color  gearType 받아 초기화하는 생성자
	Car(String color, String gearType) {
		this(color, gearType, 4);
//		this.color = color;
//		this.gearType = gearType;
//		this.doorCount = 4;
	}
	// color gearType doorCount 받아 초기화하는 생성자
	Car(String color, String gearType, int doorCount) {
		this.color = color;
		this.gearType = gearType;
		this.doorCount = doorCount;
	}
	// getter/setter 메서드
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getGearType() {
		return gearType;
	}
	void setGearType(String gearType) {
		this.gearType = gearType;
	}
	int getDoorCount() {
		return doorCount;
	}
	void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	
	// printCar() 출력  "색상:   타입:   문수:   "
	void printCar() {
		System.out.print("색상: "+color);
		System.out.print(", 타입: "+gearType);
		System.out.println(", 문수: "+doorCount);
	}
	
	
}
