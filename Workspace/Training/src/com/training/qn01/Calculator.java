package com.training.qn01;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Calculator Application ");
		System.out.println(" Enter following choice ");
		System.out.println("1 for Addition ");
		System.out.println("2 for Subtraction ");
		System.out.println("3 for Multiplication ");
		System.out.println("4 for Division ");
		Scanner sc = new Scanner(System.in);
		int operation = sc.nextInt();

		System.out.println("Enter first number in next line ");
		int a = sc.nextInt();

		System.out.println("Enter second number in next line ");
		int b = sc.nextInt();
		int c = 0;
				
		String resultOperation = null;

		switch (operation) {
		case 1:
			resultOperation = "Sum";
			c = a + b;
			break;
		case 2:
			resultOperation = "Difference";
			c = a - b;
			break;
		case 3:
			resultOperation = "Product";
			c = a * b;
			break;
		case 4:
			resultOperation = "Division";
			c = a / b;
			break;
		default:
			System.out.println(" Enter the valid choice in the range 1 to 4 ");
			break;
		}

		System.out.println(" The " + resultOperation + " of " + a + " and " + b + " is = " + c);
	}

}
