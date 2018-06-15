package com.bridgelabz.adapterdesignpatterns;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
