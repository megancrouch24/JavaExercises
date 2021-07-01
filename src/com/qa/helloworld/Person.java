package com.qa.helloworld;

public class Person {

	String name;
	int age;
	String jobtitle;

	public Person() {

	}

	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;

	}

	public void PrintPerson() {
		System.out.println(name + " " + age + " " + jobtitle);

	}

}
