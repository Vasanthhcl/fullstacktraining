package com.training.qn39;

import java.util.Scanner;

public class AccountCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String accountNumber;
		int accountBalance;
		int choice;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number ");
		accountNumber = sc.next();

		System.out.println("Enter the Account Balance ");
		accountBalance = sc.nextInt();

		Account newAccount = new Account(accountNumber, accountBalance);

		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount ");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Enter the amount to deposit ");
			newAccount.deposit(sc.nextInt());
			break;

		case 2:
			System.out.println("Enter the amount to withdraw ");
			newAccount.withdraw(sc.nextInt());
			break;

		default:
			System.out.println(" Incorrect option selected ");
			break;
		}

	}

}
