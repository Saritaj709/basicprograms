package com.bridgelabz.designpattern;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception Occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		System.out.println("static block instance created");
		return instance;
	}

	public static void main(String[] args) {
		getInstance();
	}
}