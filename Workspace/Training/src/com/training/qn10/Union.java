package com.training.qn10;

import java.util.Arrays;
import java.util.HashSet;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = { 1, 2, 3, 4 };
		Integer[] b = { 3, 4, 5, 6 };

		HashSet<Integer> set = new HashSet<>();

		set.addAll(Arrays.asList(a));

		set.addAll(Arrays.asList(b));

		System.out.println(set);

		// convert to array
		Integer[] union = {};
		union = set.toArray(union);

		System.out.println(Arrays.toString(union));

	}

}
