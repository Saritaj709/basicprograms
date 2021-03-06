/******************************************************************************
 *  Compilation:  javac -d bin monthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.util.monthlyPayment P Y R,P=principal,Y=year,R=rate of interest
 *  Purpose: Determines the monthly payment
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args)
	{ double P = 0,Y = 0,R = 0;
       try {
		P=Double.parseDouble(args[0]);
		Y=Double.parseDouble(args[1]);
		R=Double.parseDouble(args[2]);
       }
		catch(Exception e){
			System.out.println("array index out of bound,enter values");
		}
       Utility.monthlyPayment(P,Y,R);
	}

}
