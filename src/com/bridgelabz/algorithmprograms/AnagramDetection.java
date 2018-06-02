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
import  com.bridgelabz.utility.Utility;

public class AnagramDetection {
	public static void main(String[] args)
	{
   Utility a=new Utility();
   System.out.println("enter the strings");
   String s1=Utility.userString();
   String s2=Utility.userString();
	 a.anagramDetection(s1,s2);
	}

}
