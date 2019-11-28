package com.exam;

public class Rectangle {
	int x, y, width, height;
	
	Rectangle() {
		
	}
	Rectangle(int _x, int _y, int _width, int _height) {
		x = _x;
		y = _y;
		width = _width;
		height = _height;
	}
	int square() {
		return (width * height);
	}
	void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}
	boolean contains(Rectangle r) {
		if((x + width) > (r.x + r.width) && (y + height) > (r.y + r.height)) {
			return true;
		} else {
			return false; 
		}
		
				
					
	}
} // class
