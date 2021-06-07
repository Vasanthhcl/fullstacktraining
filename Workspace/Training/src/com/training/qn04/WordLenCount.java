package com.training.qn04;

public class WordLenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] inputArray = { "aa", "b", "cc", "ddd" };
		int occuranceFinder = 3;
		int wordCounter = 0;

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i].length() == occuranceFinder) {
				++wordCounter;
			}
		}

		System.out.println(" Number of words which matches the count " + occuranceFinder + " is = " + wordCounter);
	}

}
