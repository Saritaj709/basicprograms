package com.bridgelabz.oops;

public class DeckOfCards {
	static String[] suits = { "clubs", "diamond", "hearts", "spades" };
	static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };

	public static String[][] shuffleCards(String[][] deck, String[] suits, String[] ranks) {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				int ran1 = (int) (Math.random() * suits.length);
				int ran2 = (int) (Math.random() * ranks.length);

				String temp = deck[ran1][ran2];
				deck[ran1][ran2] = deck[i][j];
				deck[i][j] = temp;
			}
		}
		return deck;
	}

	public static void distributeCards(String[][] deck) {
		for (int i = 0; i < 4; i++) {
			System.out.println();
			System.out.println("Cards received by player " + (i + 1) + " are :");
			System.out.println("*******************************");
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		String[][] deck = new String[4][13];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[i][j] = ranks[j] + " of " + suits[i];
			}
		}
		shuffleCards(deck, suits, ranks);
		distributeCards(deck);
	}
}
