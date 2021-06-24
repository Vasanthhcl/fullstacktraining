package com.training.qn28;

import java.util.Scanner;

public class SecureURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the string ");
		String url = sc.next();

		if (!url.startsWith("https")) {
			System.out.println("Enter the start string https " + url + " does not start with \"https\" ");
		} else {
			System.out.println("Enter the start string https " + url + " start with \"https\" ");
		}
	}

}
