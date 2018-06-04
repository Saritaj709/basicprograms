/******************************************************************************
 *  Compilation:  javac -d bin binarySearchWord.java
 *  Execution:    java -cp bin com.bridgelabz.util.binarySearchWord String
 *  Purpose: finds the position of given word present in array
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args)
	{
		System.out.println("enter the string");
		String str=Utility.userString();
		String str1[]=str.split(" ");
		System.out.println("enter the word to search");
		
		String key=Utility.userNext();
		Utility.binarySearchWord(str1,key);
	}
}
