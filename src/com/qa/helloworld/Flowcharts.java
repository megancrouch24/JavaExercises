package com.qa.helloworld;

public class Flowcharts {

	public static void main(String[] args) {
		System.out.println(addormultiply(1, 2, true));
		flowchart(5000);
	}

	public static int addormultiply(int value1, int value2, boolean T) {
		if (T) {
			return value1 + value2;
		} else {
			return value1 * value2;

		}
	}

	public static void flowchart(int a) {

		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");

					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
}