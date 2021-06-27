package com.training.qn11;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArray1[] = { 1,2,3,4 };
		int myArray2[] = { 3,4,5,6 };
		System.out.println("Intersection of the two arrays ::");

		for (int i = 0; i < myArray1.length; i++) {
			for (int j = 0; j < myArray2.length; j++) {
				if (myArray1[i] == myArray2[j]) {
					System.out.println(myArray2[j]);
				}
			}
		}
	}

}
