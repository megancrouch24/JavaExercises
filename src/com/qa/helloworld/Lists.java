package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

	    names.add("Megan");
		names.add("Niall");
		names.add("Simon");
		names.add("George");

		System.out.println(names);
		System.out.println(names.get(0));

		names.set(1, "Tom");
		names.remove(3);

		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		System.out.println(names.size());

		for (String name : names) {
			System.out.println(name);
		}
	}

}
