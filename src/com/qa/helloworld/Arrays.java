package com.qa.helloworld;

import java.util.List;

public class Arrays {

	public static void main(String[] args) {

		// create an array that will hold 10 int values

		int[] tenArrays = new int[10];

		// populating the array with values
		tenArrays[0] = 1;
		tenArrays[1] = 2;
		tenArrays[2] = 3;
		tenArrays[3] = 4;
		tenArrays[4] = 5;
		tenArrays[5] = 6;
		tenArrays[6] = 7;
		tenArrays[7] = 8;
		tenArrays[8] = 9;
		tenArrays[9] = 10;

		// for loop populating int array

		for (int i = 0; i < tenArrays.length; i++) {
			tenArrays[i] = 2;

		
		
		for (int i=0; i < tenArrays.length; i++) {
			tenArrays[i] = 10 * tenArrays[i];
		
			}
		
		// calls and outputs each element for every object in the array
		for (int i : tenArrays) {
			System.out.println(i);
		}

	}
}

	public static List<?> asList(String[] names) {
		// TODO Auto-generated method stub
		return null;
	}
}