package com.training.qn15;

public class UniquecharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String withoutUniqueCharacters = "Helloworld";
		String withUniqueCharacters = "";
		int count = 0;

		for (int i = 0; i < withoutUniqueCharacters.length(); i++) {

			count = 0;
			for (int j = i + 1; j < withoutUniqueCharacters.length(); j++) {

				if (withoutUniqueCharacters.charAt(i) == withoutUniqueCharacters.charAt(j)) {
					count = 1;
					break;
				}

			}

			if (count == 0) {
				withUniqueCharacters = withUniqueCharacters + withoutUniqueCharacters.charAt(i);
			}
		}

		System.out.println(withUniqueCharacters);

	}

}
