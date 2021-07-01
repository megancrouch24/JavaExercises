package com.qa.inheritance;

public class Dog extends Animal {

	public Dog() {
		// must be the first statement in a constructor 
		this("UNKNOWN", 7);
	}
	
	
	Public Dog(String name, int age) {
		super(name, "DOG", age);
	}
	
	public void wagTail() {
		System.out.println("Wags  tail");
	}
	
	
	
	

	}

	
	
	
	
	
	
	
}
