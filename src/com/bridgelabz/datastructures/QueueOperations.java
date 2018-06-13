package com.bridgelabz.datastructures;

import java.util.NoSuchElementException;

import com.bridgelabz.utility.Utility;

public class QueueOperations {
	public static int queue[];
	public static int front, rear, size, len;
	public static int amount = 0;

	public QueueOperations(int n) {
		size = n;
		queue = new int[size];
		len = 0;
		front = -1;
		rear = -1;
	}

	public static boolean isEmpty() {
		return front == -1;
	}

	public static boolean isFull() {
		return front == 0 && rear == size - 1;
	}

	public static int getSize() {
		return len;
	}

	public static int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow exception");
		return front;
	}

	public static int deposit(int i) {
		if (rear == -1) {
			front = 0;
			rear = 0;
			queue[rear] = i;
		} else if (rear + 1 >= size)
			throw new IndexOutOfBoundsException("Overflow Exception");
		else if (rear + 1 < size)
			queue[++rear] = i;
		len++;
		return i;
	}

	public static int withdraw() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		else {
			len--;
			int cash = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			return cash;
		}
	}

	public static int displayCash(int cash) {
		System.out.println("\nTransactions in order:");
		if (len == 0) {
			System.out.println("Queue is empty");
			// return;
		}
		System.out.println("\ntotal cash in bank after deposit" + cash);
		for (int i = front; i < rear; i++) {
			System.out.print(" " + queue[i]);
			cash = cash + queue[i];
		}
		return cash;
	}
}
