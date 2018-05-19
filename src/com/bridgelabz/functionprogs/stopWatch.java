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
import com.bridgelabz.utility.*;

public class stopWatch {

	public static void main(String[] args)
	 {
		 int start=0;
		 int end=10;
		 Utility.stopWatch(start,end);
	 }
}
