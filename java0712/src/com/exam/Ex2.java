package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		// Tv 객체생성 tv
		Tv tv = new Tv();
		// powerOnOff() 메소드호출
		tv.powerOnOff();
		// 출력 power
		System.out.println(tv.power);
		// 메소드호출로 채널1증가
		tv.channelUp();
		// 메소드호출로 채널1증가
		tv.channelUp();
		// 현재 채널값 출력
		System.out.println(tv.channel);
		// 메소드호출로 채널1감소
		tv.channelDown();
		// 현재 채널값 출력
		System.out.println(tv.channel);
		
		Tv tv2 = new Tv();
		tv2.powerOnOff();
		System.out.println(tv2.channel);
	} // main method

} // class Ex2
