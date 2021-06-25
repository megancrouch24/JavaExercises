package com.qa.helloworld;

public class calculator {

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(multiplication(1, 2));
		System.out.println(subtraction(3, 2));
		System.out.println(division(3, 6));
	}

	public static int multiplication(int number1, int number2) {
		return number1 * number2;

	}

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int subtraction(int number1, int number2) {
		return number1 - number2;
	}

	public static String division(double number1, double number2) {
		String result;
		if (number1 < number2) {
			result = "" + number1 / number2;
			return result;
		} else {
			result = "the division can not be performed";
			return result;

		}
	}
}