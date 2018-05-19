/******************************************************************************
 *  Compilation:  javac -d bin permutationOfString.java
 *  Execution:    java -cp bin com.bridgelabz.util.permutationOfString.java String
 *  Purpose: Determines permutation of string
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-19-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
import java.util.Scanner;

public class permutaionOfString {
 private static Scanner sc;

public static void main(String[] args)
 {
	String str;
	sc = new Scanner(System.in);
	System.out.println("enter string");
	str=sc.next();
	int n=str.length();
	Utility.permute(str,0,n-1);
}

}
