package com.exam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// p.166
		// 9번 문제
		int[][] arr = new int[4][4];

		// 랜덤값 생성해서 배열에 쓰기(저장)
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = (int) ((Math.random() * 10) + 1);
				System.out.print(arr[c][r] + "\t");
			}
			System.out.println();
		}
		// 배열 내용을 콘솔화면에 출력하기
//		for (int r=0; r<arr.length; r++) {
//			for(int c=0; c<arr[r].length; c++) {
//				System.out.print(arr[r][c] + "\t");
//			}
//			System.out.println();
//		}

		System.out.println("=========================");

		// p.168
		// 14번 문제
		String course[] = { "java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] scores = { 95, 88, 76, 62, 55 };
		// for문 이용
		while (true) {
			System.out.print("과목 이름>> ");
			String name = scanner.next();

			if (name.equals("그만")) {
				break;
			}
			boolean isExist = false;
			for (int i = 0; i < course.length; i++) {
				if (name.equals(course[i])) {
					isExist = true;
					System.out.println(name + "의 점수는 " + scores[i]);
					break;
				}
			} // for

			if (!isExist) {
				System.out.println("없는 과목입니다.");
			}

		} // while

//			if(name.equals("java")) {
//				System.out.println(name + "의 점수는 " + scores[0]); 
//			} else if(name.equals("C++")) {
//				System.out.println(name + "의 점수는 " + scores[1]); 
//			} else if(name.equals("HTML5")) {
//				System.out.println(name + "의 점수는 " + scores[2]); 
//			} else if(name.equals("컴퓨터구조")) {
//				System.out.println(name + "의 점수는 " + scores[3]); 
//			} else if(name.equals("안드로이드")) {
//				System.out.println(name + "의 점수는 " + scores[4]); 
//			} else if(name.equals("그만")) {
//				break;
//			} else {
//				System.out.println("없는 과목입니다."); 
//			}
//		}

//		while (true) {
//			System.out.print("과목 이름>>");
//			String name = scanner.next();
//
//			switch (name) {
//			case "java":
//				System.out.println(name + "의 점수는 " + scores[0]);
//				continue;
//			case "C++":
//				System.out.println(name + "의 점수는 " + scores[1]);
//				continue;
//			case "HTML5":
//				System.out.println(name + "의 점수는 " + scores[2]);
//				continue;
//			case "컴퓨터구조":
//				System.out.println(name + "의 점수는 " + scores[3]);
//				continue;
//			case "안드로이드":
//				System.out.println(name + "의 점수는 " + scores[4]);
//				continue;
//			case "그만":
//				break;
//			default:
//				System.out.println("없는 과목입니다.");
//				continue;
//			}
//			
//			break;
//		} // while

		scanner.close();

	} // main

} // class
