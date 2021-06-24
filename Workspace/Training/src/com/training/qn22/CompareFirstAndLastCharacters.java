package com.training.qn22;

public class CompareFirstAndLastCharacters {

	public static int compareCharacters(String inputString){
		
		int compareFlag =0;
		
		if(inputString.charAt(0)==inputString.charAt(inputString.length()-1)) {
			
			compareFlag = 1;
		}
		else {
			compareFlag = -1;
		}
		
		return compareFlag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inpurString = "the picture was greaf";
		System.out.println(compareCharacters(inpurString));
		
	}

}
