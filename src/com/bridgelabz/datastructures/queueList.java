package com.bridgelabz.datastructures;

public class queueList {
	singleLinkedList l = new singleLinkedList();

	// to return an empty queue
	static queueList queue() {
		return new queueList();
	}

	// to add in the queue
	public void enqueue(Comparable item) {
		l.add(item);
	}

	// to display items
	public void display() {
		l.displayln();
	}

	// to remove an element
	public Comparable dequeue() {
		return (l.pop());
	}

	// to find the size
	public int size() {
		return l.size();
	}

	// to check whether the queue is empty or not
	boolean isEmpty() {
		return l.isEmpty();
	}

}
