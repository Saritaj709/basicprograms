package com.bridgelabz.designpattern;

public enum EnumSingleton {
INSTANCE;
	public static void doSomething() {
		System.out.println("Enum created");
	}
public static void main(String[] args) {
	doSomething();
}
}
