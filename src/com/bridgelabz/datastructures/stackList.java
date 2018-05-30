package com.bridgelabz.datastructures;

public class stackList {
	singleLinkedList li = new singleLinkedList();

	public void push(Comparable item) {
		li.insert(item, 0);
	}

	public Comparable pop() {
		return li.pop();
	}

	public Comparable peek() {
		return li.peek();
	}

	public boolean isEmpty() {
		return li.isEmpty();
	}

	public int size() {
		return li.size();
	}

	public int get(int index) {
		return ((int) li.get(index));
	}

	// to display the stack
	public void display() {
		li.displayln();
		
	}
}
