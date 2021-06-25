package com.qa.helloworld;

public class BlackJack {
	public static void main(String[] args) {
		blackjack(5, 10);
		System.out.println(blackjack(5, 10));
	}

	public static int blackjack(int a, int b) {

		if (a > 21 && b > 21)
			return 0;
		else if (a <= 21 && a > b || b > 21)
			return a;
		return b;
	}

}