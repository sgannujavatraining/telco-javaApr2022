package com.prgs.utils;

public class InheritanceExample {
	public static void main(String[] args) {
		IPhone iphone12 = new IPhone();

		System.out.println("id: " + iphone12.id);
		System.out.println("name: " + iphone12.name);
		System.out.println("uuid: " + iphone12.uuid);
		System.out.println("price: " + iphone12.price);
	}

}

class Product {
	private int id;
	String name;
	public String uuid;
	protected String price;

	Product() {
		id = 23423; // generate random string
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		if (id <= 0)
			throw new RuntimeException("Invalid id value");
		this.id = id;
	}
}

class Phone extends Product {
	String model;

	public void print() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("uuid: " + uuid);
		System.out.println("price: " + price);
	}
}

class IPhone extends Phone {
	String iosVersion;

	public void print() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("uuid: " + uuid);
		System.out.println("price: " + price);
	}
}

class Galaxy extends Phone {
	String androidVersion;

	public void print() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("uuid: " + uuid);
		System.out.println("price: " + price);
	}
}
