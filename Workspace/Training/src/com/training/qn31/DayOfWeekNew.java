package com.training.qn31;

import java.util.Scanner;

public class DayOfWeekNew {

	static int dayNumber;
	static String day = " ";
	
	

	public static String calculateDayOfWeek(int dayNumber) {
		String[] dayOfWeek = new String[8];
		dayOfWeek[0] = " ";
		dayOfWeek[1] = "Sunday";
		dayOfWeek[2] = "Monday";
		dayOfWeek[3] = "Tuesday";
		dayOfWeek[4] = "Wednesday";
		dayOfWeek[5] = "Thursday";
		dayOfWeek[6] = "Friday";
		dayOfWeek[7] = "Saturday";
			
		return day = dayOfWeek[dayNumber];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Enter the day number ");
		Scanner sc = new Scanner(System.in);
		int dayNumber = sc.nextInt();

		System.out.println(" Day of the week is " + calculateDayOfWeek(dayNumber));

	}

}
