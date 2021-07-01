package com.qa.helloworld;

public class Strings {

	public static void main(String args[]) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		method1("this is a string");
		method2("my new string");
		method3("my name is megan");
		method4("its friday today!", "friday"); 
	}

	public static void method3(String input) {
		int space = input.length();
		for (int a = input.length(); a > 0; a--) {
			if (input.substring(a - 1, a).contentEquals(" ")) {
				System.out.println(input.substring(a, space));
				space = a;
			} else if (a == 1) {
				System.out.println(input.substring(a - 1, space));
			}
		}
	}

	public static boolean method4(String message, String find) {
		boolean myBool = false;
		for (int i = 0; i < message.length(); i++) {
			if (find.substring(0, 1).equals(message.substring(i, i + 1))) {
				for (int j = 0; j < find.length(); j++) {
					if (find.substring(j, j + 1).equals(message.substring(j + i, j + i + 1))) {
						myBool = true;
					} else {
						myBool = false;
					}
				}
			}
		}
		System.out.println("true or false? " + myBool);
		return myBool;
	}

	public static void method2(String string) {
		// TODO Auto-generated method stub
		int z = 0;
		for (int i = 1; i < string.length(); i++) {
			if (string.substring(z, i).contains(" ")) {
				System.out.println(string.substring(z, i));
				z = i;
			}
		}
		System.out.println(string.substring(z));
	}
//count and return how many words there are in that String

	public static void method1(String string) {
		// TODO Auto-generated method stub
		int wordcount = 1;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				wordcount++;
			}
		}
		System.out.println(wordcount);

	}
}
