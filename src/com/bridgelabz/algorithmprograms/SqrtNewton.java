/******************************************************************************
 *  Compilation:  javac -d bin sqrtNewton.java
 *  Execution:    java -cp bin com.bridgelabz.util.sqrtNewton nonnegative no. c
 *  Purpose: Determines the sqrt of the no.
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  21-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;
import  com.bridgelabz.utility.Utility;

public class SqrtNewton {
public static void main(String[] args)
{
	System.out.println("enter the arguments");
	double a=Utility.userDouble();
	double b=Utility.userDouble();
    Utility.distance1(a,b);	
}
}
