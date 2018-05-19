/******************************************************************************
 *  Compilation:  javac -d bin flipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.flipCoin.java noOfFlops
 *  Purpose: Generates  Percentage of head versus tail
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-18-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;

public class power2 {
public static void main(String[] args)
{
	int N;
	N=Integer.parseInt(args[0]);
	System.out.println("enter N " +args[0]);
 Utility.power2(N);
}
}
