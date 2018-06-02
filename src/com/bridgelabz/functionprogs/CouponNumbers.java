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

import com.bridgelabz.utility.Utility;

public class CouponNumbers {

	public static void main(String[] args)
	{
	       System.out.println("enter the value to generate coupon");
		  int n=Utility.userInt();
		 int count=Utility.collect(n);
		 System.out.println("No. of times to generate distinct coupons:"+count);
		 
	}

}
