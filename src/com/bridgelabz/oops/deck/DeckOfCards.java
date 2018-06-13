/******************************************************************************
 *  Compilation:  javac -d bin DeckOfcards.java
 *  Execution:    java -cp bin com.bridgelabz.oops.deck.java  suits ranks
 *  Purpose: Displays a unique deck of cards received by 4 players 
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  12-06-2018
 ******************************************************************************/

package com.bridgelabz.oops.deck;

import com.bridgelabz.utility.Utility;

public class DeckOfCards {
	static String[] suits = { "clubs", "diamond", "hearts", "spades" };
	static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	static String[][] str = new String[100][];

	public static void main(String[] args) {
		String[][] deck = new String[52][52];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[i][j] = ranks[j] + " of " + suits[i];

			}
		}

		Utility.shuffleCards(deck, suits, ranks);
		Utility.distributeCards(deck);
	}
}
