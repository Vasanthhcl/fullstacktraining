package com.classroomTraining;

public class Item {

	private int id;
	private String name;
	private String country;

	Item() {
		id = 10;
		name = "Flipkart";
	}

	Item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Item(int id, String name, String country) {
		this(id, name);
		this.name = country;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item obj1 = new Item(22, "K", "India");
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		System.out.println(obj1.getCountry());

	}

}
