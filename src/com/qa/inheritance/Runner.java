package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.talk();

		Dog myDog = new Dog();
		myDog.setName("Joey");
		System.out.println(myDog.getName());
		myDog.wagTail();

		Animal myDogInAnimal = myDog;

		Dog myFrenchPin = new FrenchPin();
		myFrenchPin.wagTail();

	}
}
