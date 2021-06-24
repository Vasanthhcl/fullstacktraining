package com.training.qn30;

import java.util.Scanner;

public class DayOfWeek {
	
	static String[] dayOfWeek = {" ","Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	static String day = " ";
	
	public static String calculateDayOfWeek(int dayNumber) {
		
		return day=dayOfWeek[dayNumber];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(" Enter the day number ");
		Scanner sc = new Scanner(System.in);
		int dayNumber = sc.nextInt();
		
		System.out.println(" Day of the week is "+calculateDayOfWeek(dayNumber));

	}

}
