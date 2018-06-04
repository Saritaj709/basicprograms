package com.bridgelabz.datastructures;

import java.util.NoSuchElementException;

import com.bridgelabz.utility.Utility;

public class QueueOperations {
	public static int queue[];
	public static int front, rear, size, len;
	public static int amount = 0;

	public QueueOperations(int n) {
		size = n;
		queue = new int[size];
		len = 0;
		front = -1;
		rear = -1;
	}

	public static boolean isEmpty() {
		return front == -1;
	}

	public static boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	public static int getSize() {
		return len;
	}

	public static int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow exception");
		return front;
	}

	public static int deposit(int i) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			queue[rear] = i;
		} else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear + 1 < size)
			queue[++rear] = i;
		len++;
		return i;
	}

	public static int withdraw() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			len--;
			int cash = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return cash;
		}
	}

	public static int displayCash(int cash) {
		System.out.println("\nTransactions in order:");
		if (len == 0) {
			System.out.println("Queue is empty");
			// return;
		}
		System.out.println("\ntotal cash in bank after deposit" + cash);
		for (int i = front; i < rear; i++) {
			System.out.print(" " + queue[i]);
			cash = cash + queue[i];
		}
		return cash;
	}
	public static void switchCases()
	{
		int cash=0;
		char ch;
	do {
		System.out.println("Queue Operations\n");
		System.out.println("1. insert(deposit) \n");
		System.out.println("2. delete(withdraw) \n");
		System.out.println("3. peek  \n");
	    System.out.println("4. CheckEmpty \n");
	    System.out.println("5. CheckFull \n");
	    int choice=Utility.userInt();
	    int i = 0;
	    switch(choice)
	    {
	    case 1:int amount1=0;
	    	try{
	    		System.out.println("enter the amount to deposit\n");
	    	amount1=QueueOperations.deposit(Utility.userInt());
	    	}
	    catch(Exception e)
	    {
	    	System.out.println("Error:"+e.getMessage());
	    }
	    if(QueueOperations.isFull()!=true)
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
	    int amount=Utility.userInt();
	    if(amount<=cash)
	    	{
	    	System.out.println("withdraw successful"+QueueOperations.withdraw());
	    cash=cash-amount;
	    	}
	    else
	    	System.out.println("insuficient amount in bank,pls wait...for deposit");
	    break;
	    case 3:
	    	try {
	    	System.out.println("peek element:"+QueueOperations.peek());
	    }
	    	catch(Exception e)
	    	{
	    		System.out.println("error:"+e.getMessage());
	    	}
	    	break;
	    case 4:System.out.println("Empty Status:"+QueueOperations.isEmpty());
	    break;
	    case 5:System.out.println("Full Status:"+QueueOperations.isFull());
	    break;
	    default:System.out.println("wrong entry");;
	    break;
	}
	QueueOperations.displayCash(cash);
	System.out.println("Do you want to continue,(type y or n)"); 
	ch=Utility.userChar();
}
while(ch=='y'||ch=='Y');
	}
}
