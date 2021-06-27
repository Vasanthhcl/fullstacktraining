package com.training.qn39;

public class Account {

	private String accountNumber;
	private int balance;

	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int transactionAmount) {

		this.balance = this.balance + transactionAmount;
		printCurrentBalance();
	}

	public void printCurrentBalance() {

		System.out.println("Your balance after the transaction is: " + this.balance);
	}

	public void withdraw(int transactionAmount) {

		int newBalance = balance - transactionAmount;

		if (newBalance < 0) {
			System.out.println("Insufficient balance ");
			printCurrentBalance();
		} else {
			this.balance = newBalance;
			printCurrentBalance();
		}
	}

}
