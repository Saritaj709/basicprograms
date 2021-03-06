package com.bridgelabz.datastructures;

public class SingleLinkedList {
	private Node head;
	private Node tail;
	int count;

	public SingleLinkedList singleLinkedList() {
		return new SingleLinkedList();
	}

	public class Node {
		public Comparable data;
		public Node next;

		public Node(Comparable data) {
			this.data = data;
			this.next = null;
		}

		public Node(Comparable data, Node next) {
			this.data = data;
			this.next = null;
		}
	}

	// to add a item to the list
	public void add(Comparable item) {
		if (head == null) {
			head = new Node(item);
			count++;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(item);
		count++;
	}

	// to display in same line
	public void display() {

		Node last = head;
		for (int i = 1; i <= size(); i++) {
			System.out.print(last.data + " ");
			last = last.next.next;
		}
	}

	// to display with new line
	public void displayln() {

		Node last = head;
		for (int i = 1; i <= size(); i++) {
			System.out.println(last.data);
			last = last.next.next;
		}
	}

	// to add an item in sorted order
	public void addSort(Comparable item) {
		Node nodeToInsert = new Node(item);
		Node current = null;

		if (head == null || head.data.compareTo(nodeToInsert.data) >= 0) {
			nodeToInsert.next = head;
			head = nodeToInsert;
			count++;
			System.out.println(item + " added successfully");
			return;
		} else {
			current = head;
			while (current.next != null && current.next.data.compareTo(nodeToInsert.data) < 0) {
				current = current.next;
			}
			nodeToInsert.next = current.next;
			current.next = nodeToInsert;
			count++;
			System.out.println(item + " added successfully");

			while (tail.next != null) {
				tail = tail.next.next;
			}
			return;
		}
	}

	// to see first data
	public Comparable peek() {
		return head.data;
	}

	public void insert(Comparable item, int pos) {
		if (pos > count)
			throw new IndexOutOfBoundsException();
		if (pos == 0) {
			head = new Node(item, head);
			count++;
			return;
		}
		Node temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next;
		}
		temp.next.next = new Node(item, temp.next);
		count++;
	}

	// to find out size
	public int size() {
		return count;
	}

	// to get an item based on index
	public Comparable get(int pos) {

		if (pos == 0) {

			return head.next.data;
		}
		if (pos == 1) {
			return head.next.data;
		}
		if (pos == size()) {
			Node last = head;
			for (int i = 1; i < size() - 1; i++) {
				last = last.next;
			}
			return last.next.data;
		}
		Node last = head;
		for (int i = 0; i < pos - 1; i++) {
			last = last.next;
		}
		return last.next.data;
	}

	// to search an item whether present or not
	public boolean search(Comparable item) {
		Node last = head;
		while (last.next != null) {
			if (last.data.compareTo(item) == 0) {
				return true;
			}
			last = last.next;
			if (last.data.compareTo(item) == 0) {
				return true;
			}
		}
		return false;
	}

	// to find a value based on index
	public int index(Comparable item) {
		Node last = head;
		int count = 1;
		if (last.data.compareTo(item) == 0)
			return count;
		while (last.next != null) {
			if (last.data.compareTo(item) == 0) {
				return count;
			}
			count++;
			last = last.next.next;
			if (count == size()) {
				return count;
			}
		}
		return -1;
	}

	// to check whether the list empty or not
	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	// to add an item at last
	public void append(Comparable item) {
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(item, last.next);
		count++;
	}

	// to remove an item
	public void remove(Comparable item) {
		if (head.data.compareTo(item) == 0) {
			head = head.next;
			count--;
			return;
		}
		Node last = head;
		Node temp;
		while (last.next != null) {
			temp = last;
			last = last.next;
			if (last.data.compareTo(item) == 0) {
				temp.next = temp.next.next;
				count--;
			}
		}
	}

	// to remove based on index
	public Comparable pop(int pos) {

		if (pos == 0) {
			Node temp = head;
			head = head.next.next;
			count--;
			return temp.data;
		}
		if (pos == size()) {
			Node last = head;
			for (int i = 1; i < size() - 1; i++) {
				last = last.next;
			}
			Node temp = last.next.next;
			last.next = null;
			count--;
			return temp.data;
		}
		Node last = head;
		for (int i = 1; i < pos - 1; i++) {
			last = last.next;
		}
		Node temp = last.next;
		last.next = last.next.next;
		count--;
		return temp.data;
	}

	// to remove last element and show
	public Comparable pop() {
		Node last = head;
		if (head.next == null) {
			Comparable c = head.data;
			head = null;
			count--;
			return c;
		}
		for (int j = 1; j < size() - 1; j++) {
			last = last.next;
		}
		Node temp = last.next;
		last.next = null;
		count--;
		return temp.data;
	}
}
