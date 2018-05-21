/******************************************************************************
 *  Compilation:  javac -d bin findNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.findNumberjava N
 *  Purpose: Determines the intermediary number and final number
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class findNumber {
	public static void main(String[] args)
	{
		 int N,low,high,mid;
		 low=0;
		 int arr[]=new int[10];
		//System.out.println("enter n");
		 Scanner sc=new Scanner(System.in);
		 //n=sc.nextInt();
		int n=Integer.parseInt(args[0]);
		 N=2^n;
		high=N-1;
		 int key=n;
		 System.out.println("enter array");
		 for(int i=0;i<10;i++)
		 {
		 arr[i] = sc.nextInt();
		 }
		 Utility.binarySearch(key, low, high, arr);
		
	}

}
