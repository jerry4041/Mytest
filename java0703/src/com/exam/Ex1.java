package com.exam;



public class Ex1 {

	public static void main(String[] args) {
		int sum = 0;
		char grade='A';
		switch (grade) {
		case 'A':
			sum += 30;// 150
		case 'B':
			sum += 50;// 120
		case 'C':
			sum += 70;
			break;// 70
		case 'D':
			sum += 10; // 10
		}
		System.out.println(sum);

		int sum2 = 0;
		int i = 0;
		while (i <= 10) {
			if (i % 3 == 0) {
				sum2 += i;
			}
			i++;
		}
		System.out.println(sum2);
		System.gc();
	}//main
}
