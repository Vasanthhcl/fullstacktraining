package com.training.qn02;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Counting number of Vowels in a String ");
		System.out.println(" ************************************* ");
		System.out.println(" Enter a String for counting number of vowels in it ");

		String strInput = args[0].toLowerCase();
		int countVowelA = 0;
		int countVowelE = 0;
		int countVowelI = 0;
		int countVowelO = 0;
		int countVowelU = 0;
		int finalCountOfVowels = 0;

		for (int i = 0; i < strInput.length(); i++) {

			switch (strInput.charAt(i)) {
			case 'a':
				if (countVowelA == 0) {
					++countVowelA;
				}
				break;
			case 'e':
				if (countVowelE == 0) {
					++countVowelE;
				}
				break;
			case 'i':
				if (countVowelI == 0) {
					++countVowelI;
				}
				break;
			case 'o':
				if (countVowelO == 0) {
					++countVowelO;
				}
				break;
			case 'u':
				if (countVowelU == 0) {
					++countVowelU;
				}
				break;
			}

		}

		finalCountOfVowels = countVowelA + countVowelE + countVowelI + countVowelO + countVowelU;
		System.out.println(" Number of vowels present in string " + strInput + " is " + finalCountOfVowels);

	}

}
