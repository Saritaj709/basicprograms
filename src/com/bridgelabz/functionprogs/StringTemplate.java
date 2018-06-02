/******************************************************************************
 *  Compilation:  javac -d bin stringTemplate.java
 *  Execution:    java -cp bin com.bridgelabz.util.stringTemplate.java String
 *  Purpose: Generates Coupon Numbers
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-18-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionprogs;

import com.bridgelabz.utility.Utility;

public class StringTemplate {
	public static void main(String[] args) {
		System.out.println("enter the string");
		String s1 = Utility.userString();
		String str = Utility.stringTemplate(s1);
		System.out.println(str);
	}
}
