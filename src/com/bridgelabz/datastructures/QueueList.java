package com.bridgelabz.datastructures;

public class QueueList {
	SingleLinkedList l = new SingleLinkedList();
	private int size;

	
	public QueueList(int size)
	{
		this.size=size;
	}
	// to return an empty queue
	static QueueList queue() {
		return new QueueList(0);
	}
	// to add in the queue
	@SuppressWarnings("rawtypes")
	public void enqueue(Comparable item) {
		l.add(item);
	}

	// to display items
	public void display() {
		l.display();
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
