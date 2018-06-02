/******************************************************************************
 *  Compilation:  javac -d bin array2D.java
 *  Execution:    java -cp bin com.bridgelabz.util.array2D.java rows,cols
 *  Purpose: Generates 2D implementation of arrays
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
import java.util.Scanner;

public class Array2D {
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt(); 
		        
		//calling methods
		int [][] a  =Utility.arrayInt(m,n);
		double [][] b  =Utility.arrayDouble(m,n);
		String [][] c  =Utility.arrayBoolean(m,n);
		        
		//calling display method
		Utility.display(a,b,c,m,n);
	}

}
