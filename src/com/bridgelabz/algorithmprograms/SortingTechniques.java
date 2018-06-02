/******************************************************************************
 *  Compilation:  javac -d bin sortingTechniques.java
 *  Execution:    java -cp bin com.bridgelabz.util.sortingTechniques.java  0 to n
 *  Purpose: Sorts the inputs and determines the elapsed times
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-21-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;

public class SortingTechniques {
	public static void main(String[] args)
	{
		double t1=Utility.startTimer();
		Utility.BinarySearchMethodInt();
		double t2=Utility.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
		System.out.println("enter the string");
		String str=Utility.userString();
		String str1[]=str.split(" ");
		System.out.println("enter the word to search");
		
		String key=Utility.userString();
		t1=Utility.startTimer();
		Utility.binarySearchWord(str1,key);
		t2=Utility.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=Utility.startTimer();
		Utility.insertionSortInt();
		t2=Utility.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=Utility.startTimer();
		Utility.insertionsortString();
		t2=Utility.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=Utility.startTimer();
		Utility.bubbleSortInt();
		t2=Utility.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=Utility.startTimer();
		Utility.bubbleSortString();
		t2=Utility.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
	}

}
