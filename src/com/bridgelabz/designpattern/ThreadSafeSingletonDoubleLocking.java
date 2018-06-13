package com.bridgelabz.designpattern;

public class ThreadSafeSingletonDoubleLocking{
	private static ThreadSafeSingletonDoubleLocking instance;
public static ThreadSafeSingletonDoubleLocking getInstanceUsingDoubleLocking(){
	if(instance==null) {
		synchronized(ThreadSafeSingletonDoubleLocking.class) {
			if(instance==null) {
				instance=new ThreadSafeSingletonDoubleLocking();
				System.out.println("Double locking instance created");
			}
		}
	}
	return instance;
}
public static void main(String[] args)
{
	getInstanceUsingDoubleLocking();
}
}
