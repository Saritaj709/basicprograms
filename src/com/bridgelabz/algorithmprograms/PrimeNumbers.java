/******************************************************************************
 *  Compilation:  javac -d bin primeNumbers.java
 *  Execution:    java -cp bin com.bridgelabz.util.primeNumbers.java 0 to 1000
 *  Purpose: Detects if two strings are anagrams or not
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println("The prime no.s from 0 to 1000 :");
		for (int i = 0; i < 1000; i++) {
			if (Utility.findPrime(i) == true) {
				System.out.println(i);
			}

		}
	}
}