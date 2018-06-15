package com.bridgelabz.observerdesignpatterns;

import java.util.Observer;

public interface Subject {
	public void register(Observer obj);

	public void unRegister(Observer obj);

	public void notifyObservers();

	public String getUpdate(Observer obj);
}
