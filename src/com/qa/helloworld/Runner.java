package com.qa.helloworld;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.PrintPerson();

		Person person2 = new Person("Megan", 24, "software tester");
		person2.PrintPerson();
	

		List<Person> classRoom = new Arraylist<>();
		classRoom.add(person1);
		classRoom.add(person2);

		for (Person person : classRoom) {
			person.PrintPerson();
		}

	}

}
