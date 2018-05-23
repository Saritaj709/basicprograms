/******************************************************************************
 *  Compilation:  javac -d bin genericFunctions.java
 *  Execution:    java -cp bin com.bridgelabz.util.genericFunctions.java input  
 *  Purpose:auses single generic function for all data types
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  23-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.generics;
import com.bridgelabz.utility.*;

public class genericFunctions {
public static void main(String[] args)
{ 
	Integer arr[]= {1,2,3,4,5,6,7};
     int x=5,x1=6;
     String arr1[]= {"abc","agh","amk","klm"};
     String s1="klm";
     Integer arr2[]= {1,3,2,4,2,9};
	int index =Utility.genBinarySearch(arr,0,arr.length-1,x);
	System.out.println(+index);
	int index1 =Utility.genBinarySearch(arr1,0,arr.length-1,s1);
	System.out.println(+index1);
	Utility.swap(arr2,0,arr2.length-1);
	int index3 =Utility.genBinarySearch(arr1,0,arr.length-1,s1);
	System.out.println(+index3);
	int index2=Utility.genlinearSearch(arr,x1,0,arr.length-1);
	System.out.println(+index1);
	Utility.swap(arr2,0,arr2.length-1);
	for(int i=0;i<arr2.length-1;i++)
	System.out.println(arr2[i]);
	Utility.genInsertionSort(arr2);
	for(int item:arr2) {
		System.out.print(item);
		Utility.genMergeSort();
	}
}
}