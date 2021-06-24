package com.training.qn27;

import java.util.Scanner;

public class CompareTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println(" Enter the first number ");
		int firstNumber = sc.nextInt();

		System.out.println("Enter the second number ");
		int secondNumber = sc.nextInt();
		
		if(firstNumber>secondNumber) {
			result = " is greater than ";
		}
		else if(firstNumber<secondNumber){
			result = " is less than ";
		}
		else if(firstNumber==secondNumber){
			result = " is equal to ";
		}
		
		System.out.println(firstNumber+result+secondNumber);

	}

}
