package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		/*
		int i = 3;
		if (i%2 == 0) {
			if (i%3 == 0) {
				System.out.println("6의 배수");
			}
		} else { 
			System.out.println("홀수");
		}
		*/
		
		// p.107
				// 4.
				int height;
				double size = 0.25;
				height = 10;
				double total = (double)height + size;
				char c = 'a';
				String name = "홍길동";
				
				// 5.
				// 79.8 -> double
				// 10 / 3 -> 3 -> int
				// 10.0 / 3 -> 3.333333 -> double
				// 10 == 9 -> false -> boolean
				boolean b = false;
				
				// 6.
				final double bodyTemp = 36.5;
				//bodyTemp = 3.33;
				
				// 7.
				int score = 85;
				if (80 < score && score < 90) {	
				System.out.println(score);
				}
				
				// 10.
				int n =6;
				System.out.println((n > 5) ? n : 5);
				
				// 11.
				System.out.println("\"를 출력하려면 \\ 다음에 \"를 붙여 \\\"과 같이 하면 됩니다.\n");
				System.out.println("나는 \"Java를 " + 100 + "%\"" + "사랑해");
				//
				
				String in = "가위";
				switch (in) {
				case "가위" : System.out.println(1); break;
				case "바위" : System.out.println(2); break;
				case "보"   : System.out.println(3); break;
				default		: System.out.println(0); break;
				}

	} // main method

}
