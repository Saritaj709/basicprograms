/******************************************************************************
 *  Compilation:  javac -d bin sumOfThreeIntegers.java
 *  Execution:    java -cp bin com.bridgelabz.util.sumOfThreeIntegers.java a[],a.length
 *  Purpose: Generates  count of triplets
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.Utility;

public class SumOfThreeIntegers {
public static void main(String[] args)
{
	int a[]= {0,-1,-2,3,1,2,-3,-6,6};
	int x=a.length;
	System.out.println("possible arrangements for triplets : ");
	int count= Utility.countTriplets(a,x);
	 System.out.println("No.of triplets possible:" + count);
}
}
