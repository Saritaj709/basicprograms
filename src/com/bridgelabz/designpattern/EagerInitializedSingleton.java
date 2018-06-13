package com.bridgelabz.designpattern;

public class EagerInitializedSingleton{
	private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
	private EagerInitializedSingleton() {}
	public static EagerInitializedSingleton getInstance() {
		System.out.println("instance created");
		return instance;
	}
	public static void main(String[] args)
	{
		EagerInitializedSingleton.getInstance();
	}
}
