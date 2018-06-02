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
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class FindNumber {
	public static int a=0;
	public static void main(String[] args)
	{
		 try {
			 a=Integer.parseInt(args[0]);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Enter command line argument");
		 }
		int[] arr=new int[a];
		Arrays.sort(arr);
		int index=Utility.findNumber(arr, 0, arr.length-1);
		System.out.println(index);
		System.out.println("No. is" +a);
	     
	}

}

