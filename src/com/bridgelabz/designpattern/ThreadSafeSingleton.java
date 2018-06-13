package com.bridgelabz.designpattern;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
			System.out.println("Thread safe instance created");
		}
		return instance;
	}

	public static void main(String[] args) {
		getInstance();
	}
}
