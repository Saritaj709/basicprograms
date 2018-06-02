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
import com.bridgelabz.utility.*;

public class AnagramPrime {
	
public static void main(String[] args)
{
	int n=1000;
	System.out.printf("Palindrome primes till n are %d\n", n);
	Utility.printPalPrime(n);
}

}
