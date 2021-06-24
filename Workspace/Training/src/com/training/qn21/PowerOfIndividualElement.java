package com.training.qn21;

public class PowerOfIndividualElement {

	public static int sumOfPowers(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + (arr[i] * i);

		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 3, 6, 2, 1 };
		System.out.println(sumOfPowers(input));
	}

}
