package com.bridgelabz.datastructures;

import java.awt.List;
import java.util.Collections;
import java.util.NoSuchElementException;

import com.bridgelabz.utility.Node;

public class MyLinkedList<T extends Comparable<T>> {
	class Node {
		public Node next;
		public T data;

		public Node(Object data) {
			this.data = (T) data;
		}
	}

	public Node head = null;
	public int size = 0;

	public void list() {
		List LinkedList = (List) Collections.emptyList();
		System.out.println("Created an empty list");
	}

	public void add(T data) {
		Node node1 = new Node(data);
		if (head == null) {
			head = node1;
			size++;
			return;
		}
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = node1;
		size++;
		return;
	}

	public void addFirst(T data) {
		Node node1 = new Node(data);
		node1.next = head;
		head = node1;
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * @param data
	 * @param index
	 */
	public void addAt(T data, int index) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		Node node1 = new Node(data);
		int count = 0;
		Node temp = head;
		while (count < index - 1) {
			temp = temp.next;
			temp.next = node1;
			size++;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public Object remove(int index) {
		if (index == 0) {
			Object temp = head.data;
			head = head.next;
			size--;
			return temp;
		}
		Node t = head;
		int count = 0;
		while (count < index - 1) {
			t = t.next;
			count++;
		}
		Object temp = t.next.data;
		t.next = t.next.next;
		size--;
		return temp;
	}

	public int search(T data) {
		if (head.data.equals(data)) {
			return 0;
		}
		Node temp = head;
		int count = 0;
		while (temp.next != null) {
			temp = temp.next;
			count++;
			if (temp.data.equals(data)) {
				System.out.println("Word is present at :" + count);
				return count;
			}
		}
		return -1;
	}

	public T pop() {
		if (isEmpty())
			throw new NoSuchElementException("UnderFlow Exception");
		Node t = head;
		int count = 0;
		while (count < index(null) - 1) {
			t = t.next;
			count++;
		}
		Object temp = t.next.data;
		t.next = t.next.next;
		size--;
		return (T) temp;
	}

	private int index(Object object) {
		return 0;
	}

	public Comparable removeFront() {
		if (head == null) {
			return "Empty Queue";
		}
		T data = head.data;
		head = head.next;
		size--;
		return (Comparable) data;
	}
}
