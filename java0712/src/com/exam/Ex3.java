package com.exam;

public class Ex3 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "위재혁";
		stu1.hakbun = 1;
		stu1.kor = 90;
		stu1.eng = 80;
		stu1.math = 85;
		System.out.print(stu1.hakbun + " " + 
						 stu1.name + " "  + stu1.kor + " " +
						 stu1.eng + " " + stu1.math);
		System.out.println(" " + stu1.sum() + " " + stu1.avg());
		
		Student stu2 = new Student();
		stu2.name = "곽나연";
		stu2.hakbun = 2;
//		stu2.kor = 80;
//		stu2.eng = 70;
//		stu2.math = 65; 
		System.out.print(stu2.hakbun + " " + 
						 stu2.name + " "  + stu2.kor + " " + 
						 stu2.eng + " " + stu2.math);
		System.out.print(" " + stu2.sum() + " ");
		System.out.printf("%.1f",stu2.avg());
		
	} // main method

} // class Ex3
