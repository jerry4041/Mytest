package com.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// Math 클래스
		System.out.println(Math.round(3.45)); // 소수점 첫째자리 반올림 정수(롱타입)
		System.out.println(Math.round(3.55));
		
		System.out.println(Math.ceil(3.16)); // 소수점 첫째자리 올림
		System.out.println(Math.floor(3.56)); // 소수점 첫째자리 내림
		
		System.out.println(Math.ceil(-3.16)); // 소수점 첫째자리 올림
		System.out.println(Math.floor(-3.56)); // 소수점 첫째자리 내림
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 3));
		
		// Random 클래스
		Random random = new Random();
		System.out.println("0이상 100미만의 난수: "+random.nextInt(100));
		
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		
		
		// Calender 클래스: 현재날짜와 시간정보를 가짐
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1+"월"); // 월 1~11까지
		System.out.println(cal.get(Calendar.DATE)+"일");
		
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(Calendar.AM); // 0 오전
		System.out.println(Calendar.PM); // 1 오후
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시"); // 24시간 기준
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		System.out.println(cal.get(Calendar.MILLISECOND)+"밀리초"); // 1초 = 1000밀리초, 0.5초 = 500밀리초
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 1일 2월 3화 4수 5목 6금 7토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case 1: System.out.println("일"); break;
		case 2: System.out.println("월"); break;
		case 3: System.out.println("화"); break;
		case 4: System.out.println("수"); break;
		case 5: System.out.println("목"); break;
		case 6: System.out.println("금"); break;
		case 7: System.out.println("토"); break;
		}
		
		// 현재 날짜 시간정보 지우기
		cal.clear();
		cal.set(2016, 11, 25);
		
		cal.set(Calendar.HOUR_OF_DAY, 20);
		cal.set(Calendar.HOUR, 30);
		
		System.out.println(cal.toString());
		
		System.out.println("==========================");
		
		// Date 클래스
		System.out.println(System.currentTimeMillis()); // 1970년 1월1일 0시0분0초
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E요일) hh:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		// Wrapper 클래스
//		int num = null; // 기본자료형에 null 저장 못함 // Integer은 null 저장 가능
		Integer a = 5;
		Integer b = 2;
		System.out.println(a + b);
	} // main method

}
