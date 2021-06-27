package com.training.qn41;

public class Square extends Shape {

	private int side;
	
	static String shapeName = "Square";

	public Square(int side) {
		super(shapeName);
		this.side = side;
	}

	public double calculateArea() {
		return side*side;
	}

}
