package com.training.qn16;

public class ReplaceNonOccuranceCharacter {

	public static String replaceNonOccuranceCharacter(String mainString, String compareWithString) {

		String result = "";
		String tempVariable = null;
		String lowerCaseString = compareWithString.toLowerCase();

		for (int i = 0; i < mainString.length(); i++) {

			tempVariable = String.valueOf(mainString.charAt(i)).toLowerCase();
			if (!lowerCaseString.contains(tempVariable)) {
				result = result + "+";
			} else {
				result = result + String.valueOf(mainString.charAt(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "New York";
		String input2 = "New Jersy";

		System.out.println(replaceNonOccuranceCharacter(input1, input2));

	}

}
