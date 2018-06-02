package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class DequeOperations {
	int MAX = 100;
	int arr[];
	int front,rear,size;

	public DequeOperations(int size) {
		arr = new int[MAX];
		front = -1;
		rear = 0;
		this.size = size;
	}

	boolean isFull() {
		return ((front == 0 && rear == size - 1) || front == rear + 1);
	}

	boolean isEmpty() {
		return (front == -1);
	}

	void insertFront(int val) {
		if (isFull()) {
			System.out.println("overflow");
			return;
		}

		// If queue is initially empty
		if (front == -1) {
			front = 0;
			rear = 0;
		}

		// front is at first position of queue
		else if (front == 0)
			front = size - 1;

		else // decrement front end by '1'
			front = front - 1;
		arr[front] = val;
	}

	int insertRear(int val) {
		if (isFull()) {
			System.out.println("overflow");
			return 0;
		}
		// If queue is initially empty
		if (front == -1) {
			front = 0;
			rear = 0;
		}
		// rear is at last position of queue
		else if (rear == size - 1)
			rear = 0;
		// increment rear end by '1'
		else
			rear = rear + 1;
		arr[rear] = val;
		return arr[rear];
	}

	void deleteFront() {
		if (isEmpty()) {
			System.out.println("Queue underflow\n");
			return;
		}
		// Deque has only one element
		if (front == rear) {
			front = -1;
			rear = -1;
		}
		// back to initial position
		else if (front == size - 1)
			front = 0;
		else
			front = front + 1;
	}

	void deleteRear() {
		if (isEmpty()) {
			System.out.println("underflow");
			return;
		}
		// Deque has only one element
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (rear == 0)
			rear = size - 1;
		else
			rear = rear - 1;
	}

	int getFront() {
		if (isEmpty()) {
			System.out.println("underflow");
			return -1;
		}
		return arr[front];
	}

	int getRear() {
		if (isEmpty() || rear < 0) {
			System.out.println("underflow");
			return -1;
		}
		return arr[rear];
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
	    	amount1=queueOperations.deposit(Utility.userInt());
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
	    int amount=Utility.userInt();
	    if(amount<=cash)
	    	{
	    	System.out.println("withdraw successful"+queueOperations.withdraw());
	    cash=cash-amount;
	    	}
	    else
	    	System.out.println("insuficient amount in bank,pls wait...for deposit");
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
	ch=Utility.userChar();
}
while(ch=='y'||ch=='Y');
	}
}
