package com.prgs.utils;

public class BasicConcepts {

	public static void main(String[] args) {
		
		Test testObject = new Test();
		
		int returnValue = testObject.getValue();
		System.out.println(returnValue);
		
//		testObject.value = 20;  private - cant access
//		System.out.println(testObject.value);
	}

}

