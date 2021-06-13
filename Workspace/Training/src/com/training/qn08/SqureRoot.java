package com.training.qn08;

public class SqureRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;

		System.out.println(" Squre root of " + x1 + " " + x2 + " " + y1 + " " + y2 + " is equal to = "
				+ calculateSqureRoot(x1, x2, y1, y2));

	}

	public static int calculateSqureRoot(double x1, double x2, double y1, double y2) {
		return (int) (((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2)));
	}

}
