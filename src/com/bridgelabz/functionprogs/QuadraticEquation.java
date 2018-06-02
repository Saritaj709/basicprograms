/******************************************************************************
 *  Compilation:  javac -d bin Quadratic_Equation.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic_Equation.java ("X","0")  
 *  Purpose: Determines roots of a quadratic equation
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-18-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;

import com.bridgelabz.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args)
	{
		System.out.println("enter the values of a,b,c");
		double a = Utility.userDouble();
		double b = Utility.userDouble();
		double c = Utility.userDouble();
		Utility.quadratic(a,b,c);
	}

}
