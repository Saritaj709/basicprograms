/******************************************************************************
 *  Compilation:  javac -d bin vendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.util.vendingMachine.java money or change 
 *  Purpose:Determines total no. of notes and total no. of highest value notes
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  21-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Utility;

public class VendingMachine {
public static void main(String[] args)
{
	int[] notes= {1000,500,100,50,5,2,1};
    int money;
    System.out.println("enter change");
    money=Utility.userInt();
	Utility.vendingMachine(money,notes);
}
}
