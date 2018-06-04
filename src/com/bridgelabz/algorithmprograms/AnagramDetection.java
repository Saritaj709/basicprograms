/******************************************************************************
 *  Compilation:  javac -d bin anagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.util.anagramDetection.java String
 *  Purpose: Detects if two strings are anagrams or not
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class AnagramDetection {
	public static void main(String[] args) {
		System.out.println("enter the strings");
		String s1 = Utility.userString();
		String s2 = Utility.userString();
		// Utility.anagramDetection(s1,s2);
		if (Utility.isAnagram(s1, s2) == true) {
			System.out.println("The given Strings are anagram");
		} else {
			System.out.println("the given strings are not anagram");
		}
	}

}
