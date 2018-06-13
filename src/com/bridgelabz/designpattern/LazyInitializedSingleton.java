package com.bridgelabz.designpattern;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	private LazyInitializedSingleton() {}
	public static LazyInitializedSingleton getInstance() {
		if(instance==null) {
			instance=new LazyInitializedSingleton();
			System.out.println("Lazy instance created");
		}
		return instance;
	}
	public static void main(String[] args)
	{
		getInstance();
	}
}
