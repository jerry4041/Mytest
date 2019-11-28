package com.exam;

public class Tv {
	// 필드(멤버변수)
	// 전원 boolean형 power
	boolean power;
	// 채널 정수형 channel
	int channel;
	
	Tv() { //생성자
		System.out.println("Tv 생성자 호출됨.");
//		channel = 10; // 객체의 기본값을 변화시키는 상황 
//		power = true;
	}

	// 메소드
	// 전원켜기끄기 powerOnOff()
	// false -> true -> false
	void powerOnOff() {
		power = !power;
		// 다른 방법
//		if (!power) {
//			power = true;
//		} else {
//			power = false;
//		}
	}

	// 채널1증가 channelUp()
	void channelUp() {
		channel++;
	}

	// 채널1감소 channelDown()
	void channelDown() {
		channel--;
	}

}
