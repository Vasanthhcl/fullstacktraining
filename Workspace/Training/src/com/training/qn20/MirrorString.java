package com.training.qn20;

public class MirrorString {

	public static String getImage(String strNormal) {

		String strMirror = "";

		for (int i = strNormal.length() - 1; i >= 0; i--) {

			strMirror = strMirror + strNormal.charAt(i);
		}

		return strNormal + "|" + strMirror;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "EARTH";
		System.out.println(getImage(inputString));

	}

}
