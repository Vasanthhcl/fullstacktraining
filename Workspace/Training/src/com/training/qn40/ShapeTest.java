package com.training.qn40;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		Scanner sc = new Scanner(System.in);
		Shape sp = null;
		
		System.out.println("1.Rectangle 2.Square 3.Circle Area Calculator --- Choose your shape ");
		choice = sc.nextInt();
		
		switch (choice) {

		case 1:
			int length,breadth;
			
			System.out.println("Enter length and breadth ");
			length = sc.nextInt();
			breadth = sc.nextInt();
			
			sp = new Rectangle(length,breadth);	
			System.out.println("Area of Rectangle is: "+sp.calculateArea());		
			break;

		case 2:
			int side;
			
			System.out.println("Enter side: ");
			side = sc.nextInt();
			
			sp = new Square(side);	
			System.out.println("Area of Square is: "+sp.calculateArea());		
			break;
			
		case 3:
			int radius;
			
			System.out.println("Enter Radius: ");
			radius = sc.nextInt();
			
			sp = new Circle(radius);	
			System.out.println("Area of Circle is: "+sp.calculateArea());		
			break;

		default:
			System.out.println(" Incorrect option selected ");
			break;
		}

	}

}
