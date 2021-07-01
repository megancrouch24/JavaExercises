package com.qa.inheritance;

public class FrenchPin extends Dog {

	public FrenchPin() {
		this.setSpecies("Dog");
		this.setName("Joey the french Pin");

	}
@Override
	public void wagTail() {
		System.out.println("My french pin wags tail");

	}
}