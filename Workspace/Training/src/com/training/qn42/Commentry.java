package com.training.qn42;

import java.util.Scanner;

public class Commentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		Delivery del = new Delivery();
		Scanner sc = new Scanner(System.in);

		System.out.println("Menu 1.Player details of the delivery 2.Run details of the delivery ");
		choice = sc.nextInt();

		switch (choice) {

		case 1:

			String bowlerName;
			String batsmenName;

			System.out.println("Enter the bowler name ");
			bowlerName = sc.next();

			System.out.println("Enter the batsman name ");
			batsmenName = sc.next();

			del.displayDeliveryDetails(bowlerName, batsmenName);
			break;

		case 2:

			long runs;
			System.out.println("Enter the number of runs ");
			runs = sc.nextLong();
			del.displayDeliveryDetails(runs);
			break;

		default:
			System.out.println(" Incorrect option selected ");
			break;
		}

	}

}
