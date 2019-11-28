package com.exam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
	TV myTV = new TV("LG", 2017, 32);
	myTV.show();
	
	System.out.println("=============================");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
	int math = scanner.nextInt();
	int science = scanner.nextInt();
	int english = scanner.nextInt();
	Grade me = new Grade(math, science, english);
	System.out.println("평균은 " + me.average());
	
	Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
	
	song.show();
		
	Rectangle r = new Rectangle(2, 2, 8, 7);
	Rectangle s = new Rectangle(5, 5, 6, 6);
	Rectangle t = new Rectangle(1, 1, 10, 10);
	
	r.show();
	System.out.println("s의 면적은 " + s.square());
	if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
	if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	
	scanner.close();
	} // main method

} // class Test
