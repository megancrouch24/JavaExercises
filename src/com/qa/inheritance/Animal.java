package com.qa.inheritance;

public class Animal {

	private String name;
	private String species;
	private int age;
	
	// constructor overloading 
	public Animal() {
		
	}
	
	public Animal(String name, String species, int age) {
		this.name;
		this.species;
		this.age;
	}
	
	
	final public void talk() {
		System.out.println("woof");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	final String s;
	s = "Hello";
	
	
}
