/******************************************************************************
 *  Compilation:  javac -d bin stopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.util.stopWatch (start,end)  
 *  Purpose: Determines stopwatch implementation to print elapsed time 
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args)
	 {
		long start = System.nanoTime();
		System.out.println(" ");
		long end = System.nanoTime();
		 Utility.stopWatch(start,end);
	 }
}
