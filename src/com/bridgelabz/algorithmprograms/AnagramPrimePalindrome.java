/******************************************************************************
 *  Compilation:  javac -d bin anagramPrime.java
 *  Execution:    java -cp bin com.bridgelabz.util.anagramPrime.java  0 to 1000
 *  Purpose: Detects if two strings are anagrams or not
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class AnagramPrimePalindrome {

	public static void main(String[] args) {
		System.out.println("Prime no.s from 0 to 1000 are:");
		for (int i = 0; i < 1000; i++) {
			if (Utility.findPrime(i) == true) {
				System.out.println(i);
			}
		}
		System.out.println("Palindrome primes till 1000 are :");
		Utility.primePalindrome();
		System.out.println();
		System.out.println("The Anagram no.s are:");
		for (int i = 0; i < 1000; i++) {
			int k = 0;
			if (Utility.findPrime(i) == true) {
				for (int j = i + 1; j < 1000; j++) {
					if (Utility.isAnagram(("" + i), ("" + j)) == true) {
						k++;
						System.out.println(" " + i + " is Anagram of" + " " + j);
					}
				}
			}
		}
	}
}
