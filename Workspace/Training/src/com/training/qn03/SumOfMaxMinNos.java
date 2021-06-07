package com.training.qn03;

public class SumOfMaxMinNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberArray = { 55, 48, 88, 77, 99, 22 };

		int max = numberArray[0];
		int min = numberArray[0];

		for (int i = 1; i < numberArray.length; i++) {

			if (max < numberArray[i]) {
				max = numberArray[i];
			}

			if (min > numberArray[i]) {
				min = numberArray[i];
			}
		}

		System.out.println(" The sum of maximum number " + max + " and minimum number " + min + " is = " + (max + min));
	}

}
