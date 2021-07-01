package com.qa.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Runner1 {

	public static void main(String[] args) {
		List<User> people = new ArrayList<User>();

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();

		user1.setForename("Meg");
		user1.setSurname("Crouch");
		user1.setAge(24);
		user1.setEmail("megancrouch@qa.com");
		user1.setTelephoneNo("07943699413");
		user1.addMiddleNames("Elizabeth");

		user2.setForename("Si");
		user2.setSurname("White");
		user2.setAge(22);
		user2.setEmail("simonwhite@qa.com");
		user2.setTelephoneNo("07943699421");
		user2.addMiddleNames("Mark");

		user3.setForename("Niall");
		user3.setSurname("Duggan");
		user3.setAge(26);
		user3.setEmail("NiallDuggan@qa.com");
		user3.setTelephoneNo("07943699423");
		user3.addMiddleNames("Hugh");
		user3.addMiddleNames("Patrick");

		people.add(user1);
		people.add(user2);
		people.add(user3);

		for (User p : people) {
			System.out.println(p);
		}
	}

}
