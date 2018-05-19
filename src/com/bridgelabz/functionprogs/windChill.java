/******************************************************************************
 *  Compilation:  javac -d bin windChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.windChill.java (start,end)  
 *  Purpose: Determines stopwatch implementation to print elapsed time 
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
public class windChill {
public static void main(String[] args)
{
	double t=Double.parseDouble(args[0]);
	System.out.println("t value is"+t);
	double v=Double.parseDouble(args[1]);
	System.out.println("t value is"+v);
	Utility.windChill(t,v);
}
}
