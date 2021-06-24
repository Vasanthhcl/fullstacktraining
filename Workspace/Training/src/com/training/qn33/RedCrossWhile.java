package com.training.qn33;

import java.util.Scanner;

public class RedCrossWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;

		System.out.print(" Enter number of Tents ");
		Scanner sc = new Scanner(System.in);
		int tentSize = sc.nextInt();
		int tentNumber = 0;

		int[] refugeeCount = new int[tentSize];

		while (tentNumber < refugeeCount.length) {

			System.out.print("Enter the persons statying in tent " + tentNumber + " is = ");
			refugeeCount[tentNumber] = sc.nextInt();
			total = total + refugeeCount[tentNumber];
			tentNumber++;

		}

		System.out.println("The Ttal number of citizens present in the camp " + total);

	}

}
