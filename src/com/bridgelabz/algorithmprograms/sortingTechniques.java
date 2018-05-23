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
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class sortingTechniques {
	public static void main(String[] args)
	{
		Utility searchsort=new Utility();
		double t1=searchsort.startTimer();
		searchsort.BinarySearchMethodInt();
		double t2=searchsort.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		System.out.println("enter the word to search");
		
		String key=sc.next();
		t1=searchsort.startTimer();
		Utility.binarySearchWord(str1,key);
		t2=searchsort.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=searchsort.startTimer();
		searchsort.insertionSortInt();
		t2=searchsort.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=searchsort.startTimer();
		searchsort.insertionsortString();
		t2=searchsort.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=searchsort.startTimer();
		searchsort.bubbleSortInt();
		t2=searchsort.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
		t1=searchsort.startTimer();
		searchsort.bubbleSortString();
		t2=searchsort.endTimer();
		System.out.println("time elapsed is"+(t2-t1));
	
	}

}