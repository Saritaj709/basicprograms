package com.bridgelabz.datastructures;

class QNode<T extends Comparable<T>> {
	protected T data;
	QNode<T> next;

	QNode(T d) {
		data = d;
		next = null;
	}
}

public class QList<T extends Comparable<T>> {
	QNode<T> front;
	QNode<T> rear;
	int size = 0;

	public QList() {
		front = null;
		rear = null;
	}

	// Method to add an key to the queue.
	public void enqueue(T key) {
		// Create a new LL node
		QNode<T> temp = new QNode<T>(key);
		// If queue is empty, then new node is front and rear both
		if (rear == null) {
			front = temp;
			rear = temp;
		}
		// Add the new node at the end of queue and change rear
		rear.next = temp;
		rear = temp;
		size++;
	}

	// Method to remove an key from queue.
	public T dequeue() {
		// If queue is empty, return NULL.
		if (front == null) {
			return null;
		}
		// Store previous front and move front one node ahead
		QNode<T> temp = front;
		front = front.next;
		size--;
		if (temp == null) {
			rear = null;
			size--;
		}
		// If front becomes NULL, then change rear also as NULL
		return (T) temp.data;
	}

	public int size() {
		return size;
	}

	public void display() {
		QNode<T> node = front;
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}
}
