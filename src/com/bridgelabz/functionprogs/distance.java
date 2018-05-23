/******************************************************************************
 *  Compilation:  javac -d bin distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.distance.java (x,y)
 *  Purpose: Determines Euclidean distance from origin
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;

public class distance {
	public static void main(String[] args)
	{
		System.out.println("enter x "+args[0]);
		System.out.println("enter y "+args[1]);
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Utility.distance1(x,y);
	}

}
