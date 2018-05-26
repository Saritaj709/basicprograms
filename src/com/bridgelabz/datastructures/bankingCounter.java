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
import java.util.Scanner;

public class bankingCounter {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);	
    int cash=0;
	System.out.println("The initial balance is"+cash);
	System.out.println("enter the no. of people entering");
	int n=sc.nextInt();
	System.out.println("The no. of people entering are:"+n);
	 queueOperations queueOperations=new queueOperations(n);
	char ch;
	do {
		System.out.println("Queue Operations\n");
		System.out.println("1. insert(deposit) \n");
		System.out.println("2. delete(withdraw) \n");
		System.out.println("3. peek  \n");
	    System.out.println("4. CheckEmpty \n");
	    System.out.println("5. CheckFull \n");
	    int choice=sc.nextInt();
	    int i = 0;
	    switch(choice)
	    {
	    case 1:int amount1=0;
	    	try{
	    		System.out.println("enter the amount to deposit\n");
	    	amount1=queueOperations.deposit(sc.nextInt());
	    	}
	    catch(Exception e)
	    {
	    	System.out.println("Error:"+e.getMessage());
	    }
	    if(queueOperations.isFull()!=true)
    	{
    	cash=cash+amount1;
    	 System.out.println("Total amount after deposit:"+cash);
    	}
	    break;
	    case 2:
	    try {
	    	System.out.println("the maximum amount that can be withdrawn is:"+cash);  
	    }
	    catch(Exception e)
	    {
	    	System.out.println("error:"+e.getMessage());
	    }
	    System.out.println("enter the amount to be withdrawn");
	    int amount=sc.nextInt();
	    if(amount<=cash)
	    	{
	    	System.out.println("withdraw successful"+queueOperations.withdraw());
	    cash=cash-amount;
	    	}
	    else
	    	System.out.println("insuficient amount in bank,pls wait...for deposit");
	    	//queueOperations.deposit(i);
	    break;
	    case 3:
	    	try {
	    	System.out.println("peek element:"+queueOperations.peek());
	    }
	    	catch(Exception e)
	    	{
	    		System.out.println("error:"+e.getMessage());
	    	}
	    	break;
	    case 4:System.out.println("Empty Status:"+queueOperations.isEmpty());
	    break;
	    case 5:System.out.println("Full Status:"+queueOperations.isFull());
	    break;
	    default:System.out.println("wrong entry");;
	    break;
	}
	queueOperations.displayCash(cash);
	System.out.println("Do you want to continue,(type y or n)"); 
	ch=sc.next().charAt(0);
}
while(ch=='Y' || ch=='y');
}    	
}

