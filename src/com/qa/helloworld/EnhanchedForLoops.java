package com.qa.helloworld;

public class EnhanchedForLoops {

	public static void main(String[] args) {

		// create an array of strings

		String[] stArray = { "Meg", "Niall", "Si" };
		String[] lArray = { "Tom", "Charlotte", "Dave" };

		printArray(stArray);
		printArray(lArray);
	}

	public static void printArray(String[] stringArray) {
		for (String str : stringArray) {
			System.out.println(str);
		}

		int[] iArray = new int[20];
		int A = 1;
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = A++;
		}

	}

}
