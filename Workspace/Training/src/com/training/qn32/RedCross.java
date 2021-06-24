package com.training.qn32;

import java.util.Scanner;

public class RedCross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;

		System.out.print(" Enter number of Tents ");
		Scanner sc = new Scanner(System.in);
		int tentSize = sc.nextInt();
		int tentNumber = 0;

		int[] refugeeCount = new int[tentSize];

		for (int i = 0; i < refugeeCount.length; i++) {
			tentNumber = tentNumber+1;
			System.out.print("Enter the persons statying in tent "+ tentNumber +" is = ");
			refugeeCount[i] = sc.nextInt();
			total = total + refugeeCount[i];

		}

		System.out.println("The Ttal number of citizens present in the camp "+total);
	}

}
