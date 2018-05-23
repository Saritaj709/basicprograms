/******************************************************************************
 *  Compilation:  javac -d bin couponNumbers.java
 *  Execution:    java -cp bin com.bridgelabz.util.CouponNumbers.java n 
 *  Purpose: Generates Coupon Numbers
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-18-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class couponNumbers {
	private static Scanner sc;

	public static void main(String[] args)
	{
		int n;
		sc = new Scanner(System.in);
		  n=sc.nextInt();
		 int count=Utility.collect(n);
		 System.out.println(count);
		 
	}

}
