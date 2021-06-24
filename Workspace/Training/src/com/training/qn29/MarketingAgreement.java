package com.training.qn29;

import java.util.Scanner;

public class MarketingAgreement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the content of the document ");

		String strAgreement = sc.nextLine();
		String finalAgreement = "";

		System.out.println(" Enter the old name of the company ");
		String strCompaysOldName = sc.nextLine();
		sc.nextLine();

		System.out.println(" Enter the new name of the company ");
		String strCompaysNewName = sc.nextLine();

		finalAgreement = strAgreement.replace(strCompaysOldName, strCompaysNewName);

		System.out.println(finalAgreement);

	}

}
