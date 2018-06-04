/******************************************************************************
 *  Compilation:  javac -d bin bankingCounter.java
 *  Execution:    java -cp bin com.bridgelabz.util.bankingCounter.java  cash,deposit,withdraw
 *  Purpose: Adds money to the bank if deposit successful,subtracts the money from
 *   account if withdraw successful and displays the transaction track
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-24-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class BankingCounter {
public static void main(String[] args)
{
    int cash=0;
	System.out.println("The initial balance is"+cash);
	System.out.println("enter the no. of people entering");
	int n=Utility.userInt();
	System.out.println("The no. of people entering are:"+n);
	 QueueOperations queueOperations=new QueueOperations(n);
	queueOperations.displayCash(cash);
	queueOperations.switchCases();
}    	
}

