package com.exam;

class TV {
	int size;
	String manufacture;

	public TV() {
		this(32, "LG");
	}

	public TV(String manufacture) {
		this.manufacture = manufacture;
		System.out.println(size + "인치 " + manufacture);
	}

	public TV(int size, String manufacture) {
		this.size = size;
		this.manufacture = manufacture;
		System.out.println(size + "인치 " + manufacture);
	}
}

class Power {
	private int kick;
	private int punch;

	public Power() {

	}

	public Power(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}

	public int getKick() {
		return kick;
	}

	public void setKick(int kick) {
		this.kick = kick;
	}

	public int getPunch() {
		return punch;
	}

	public void setPunch(int punch) {
		this.punch = punch;
	}

}

public class Ex1 {

	public static void main(String[] args) {
		Power robot = new Power();

//		robot.kick = 10;
//		robot.punch = 20;
		robot.setKick(10);
		robot.setPunch(20);
//		Power robot = new Power(10, 20);

//		new TV();
//		new TV("삼성");
//		TV tv = new TV(65, "삼성");

	} // main method

}
