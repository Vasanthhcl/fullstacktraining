package com.training.qn41;

public class Rectangle extends Shape{
	
	static String shapeName = "Rectangle";
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super(shapeName);
		this.length = length;
		this.breadth = breadth;
	}

	public double calculateArea() {
		return length*breadth;
	}

}
