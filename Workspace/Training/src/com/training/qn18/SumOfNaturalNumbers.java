package com.training.qn18;

public class SumOfNaturalNumbers {

	public static int calculateSum(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		System.out.println(calculateSum(number));
	}

}
