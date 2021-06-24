package com.classroom.training.inheritance;

public class ScienceBook extends Book{

	int bookId = 2;
	String bookName = "Science Book";
	
	public void read() {
		System.out.println(" Reading Science book ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book objBook = new ScienceBook();
		System.out.println(objBook.bookId);
		System.out.println(objBook.bookName);
		
		objBook.read();
	}

}
