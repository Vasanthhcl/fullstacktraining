package com.training.qn05;

public class sumOfNumbersInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = { "2AA", "12", "ABC", "c2a" };
		int totalCount = 0;

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input[i].length(); j++) {

				if (Character.isDigit(input[i].charAt(j))) {

					totalCount = totalCount + Character.getNumericValue(input[i].charAt(j));
				}
			}
		}

		System.out.println(" Total sum of character is " + totalCount);
	}

}
