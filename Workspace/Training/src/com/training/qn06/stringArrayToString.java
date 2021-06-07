package com.training.qn06;

public class stringArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = { "Vikas", "Lokesh", "Ashok" };
		String combinedOutput = "";

		for (int i = 0; i < strArray.length; i++) {
			combinedOutput = combinedOutput + strArray[i];

			if (i != strArray.length - 1) {
				combinedOutput = combinedOutput + ",";
			}
		}

		System.out.println(" The combined String is = " + combinedOutput);
	}

}
