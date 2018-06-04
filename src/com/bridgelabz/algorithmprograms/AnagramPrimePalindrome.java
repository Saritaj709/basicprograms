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
		System.out.println("Palindrome primes till 1000 are :");
		Utility.primePalindrome();
	}

}
