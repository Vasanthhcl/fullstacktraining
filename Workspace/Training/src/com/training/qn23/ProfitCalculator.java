package com.training.qn23;

public class ProfitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double buyingPrice = 20.54;
		double sellingPrice = 40.50;
		double profit = sellingPrice-buyingPrice;
		
		System.out.println("Buying price is "+buyingPrice);
		System.out.println("Selling price is "+sellingPrice);
		System.out.println("Profit percentage is "+((profit*100)/buyingPrice));
		
	}

}
