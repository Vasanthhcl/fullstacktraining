package com.classroomTraining;

public class Product {

	int id;
	String name;
	int cost;

	Product(int id, String name, int cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalCost = 0;
		// Creating product array
		Product[] products = new Product[3];

		// Creating object for Products

		Product Product1 = new Product(1, "Pen", 50);
		Product Product2 = new Product(1, "Pencil", 25);
		Product Product3 = new Product(1, "Eraser", 10);

		products[0] = Product1;
		products[1] = Product2;
		products[2] = Product3;

		for (Product temp : products) {
			totalCost = totalCost + temp.cost;
		}

		System.out.println(" Total cost of all products is " + totalCost);

	}

}
