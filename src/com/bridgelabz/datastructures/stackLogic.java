package com.bridgelabz.datastructures;

public class stackLogic {
	public static int maxSize;
	public static long[] stackArray;
	public static int top;
	
	//for size
	public static int StackLogic(int s)
	{
		maxSize=s;
		stackArray=new long[maxSize];
		top=-1;
		return s;	             							
	}
	
	//for push
	public static void push(long j)
	{
		stackArray[++top]=j;
	}
	
	//for pop
	public static long pop()
	{
		return stackArray[top--];
	}
	
	//for peek
	public static long peek()
	{
		return stackArray[top];
	}
	// to check whether stack is empty
	public static boolean isEmpty()
	{
		return (top==-1);
	}
	//to check whether stack is null
	public static boolean isFull()
	{
		return (top==maxSize-1);
	}
}

