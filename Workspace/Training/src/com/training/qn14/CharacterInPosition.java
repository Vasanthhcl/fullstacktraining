package com.training.qn14;

public class CharacterInPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input[] = { "abc", "da", "ram" };

		int positionFinder = 3;
		String result = "";

		for (int i = 0; i < input.length; i++) {

			if (input[i].length() > positionFinder - 1) {
				result = result + input[i].charAt(positionFinder - 1);
			} else {
				result = result + "$";
			}
		}

		System.out.println(" The position of values at " + positionFinder + " is = " + result);

	}

}
