package com.training.qn40;

public class Circle extends Shape{

	private int radius;
	private static String shapeName = "Circle";
	
	public Circle(int radius) {
		super(shapeName);
		this.radius = radius;
	}
	
	public double calculateArea() {
		return 3.14*radius*radius;
	}
	
}
