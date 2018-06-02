/******************************************************************************
 *  Compilation:  javac -d bin primeFactors.java
 *  Execution:    java -cp bin com.bridgelabz.util.primeFactors.java N
 *  Purpose: Generates  prime factors of N
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.Utility;

public class PrimeFactors {
public static void main(String[] args)
{
	System.out.println("enter the number");
	int n=Utility.userInt();
	Utility.primeFactors(n);
}
}
