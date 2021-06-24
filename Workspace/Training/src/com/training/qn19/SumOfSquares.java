package com.training.qn19;

public class SumOfSquares {

	public static int calculateDifference(int number) {

		int sumOfSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i <= number; i++) {

			sumOfSquares = sumOfSquares+i * i;
			squareOfSum = squareOfSum + i;
		}

		return sumOfSquares - (squareOfSum * squareOfSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		System.out.println(calculateDifference(number));

	}

}
