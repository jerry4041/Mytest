package com.exam;

public class Ex2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.printCar();
		
		car.setColor("yellow");
		car.setGearType("auto");
		car.setDoorCount(2);
		
		System.out.println(car.getColor());
		System.out.println(car.getGearType());
		System.out.println(car.getDoorCount());
		
		Car car2 = new Car("blue", "auto");
		car2.printCar();
		
		Car car3 = new Car("red", "manual", 3);
		car3.printCar();
		
		

	} // main method

} // class Ex2
