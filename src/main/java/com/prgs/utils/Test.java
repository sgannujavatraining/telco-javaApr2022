package com.prgs.utils;


// Default (with in package), public (any), private (only within class), protected (extended classes) access modifiers

public class Test {
	private int value = 10; // Encapsulated - OOP
	
	public int getValue() {
		return value;
	}
}


class Product {
	private int id;
	protected String name;
	
	public void setId(int id) {
		this.id = id;
	}
}

class CellPhone extends Product {
	String model;
	
	CellPhone(String name) {
		setId(100);
		this.name = name;  // can access protected
	}
}

class Acces extends Product {
	String usage;
	
	Acces(String name) {
		// id = 100; Not visible as it is private
		this.name = name;
	}
}