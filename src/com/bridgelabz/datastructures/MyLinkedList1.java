package com.bridgelabz.datastructures;

import java.awt.List;
import java.util.Collections;

public class MyLinkedList1<T extends Comparable<T>> {

	private Node<T> head;
	private int size = 0;
	private Node<T> tail;
	

	public void list() {
		List LinkedList = (List) Collections.emptyList();
		System.out.println("Created an empty list");
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			tail = node;
			size++;
			return;
		}
		tail.setNext(node);
		tail = node;
		size++;
		return;
	}

	//
	public void addFirst(T data) {
		Node<T> node = new Node<T>(data);
		node.setNext(node);
		head = node;
		size++;
	}

	public void display() {
		if (size == 0) {
			System.out.println("Linked List is empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp.setNext(temp);
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
		Node node = new Node(data);
		int count = 0;
		Node temp = head;
		while (count < index - 1) {
			temp.setNext(node);
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

	// @SupressWarnings("unchecked")
	public Object remove(int index) {
		if (index == 0) {
			Object temp = head.getData();
			head = head.getNext();
			size--;
			return (T) temp;
		}

		Node t = head;
		int count = 0;
		while (count < index - 1) {
			t = t.getNext();
			count++;
		}
		Object temp = t.getNext().getData();
		t.setNext(t.getNext().getNext());
		size--;
		return (T) temp;
	}

	public int search(T data) {
		if (head.getData().equals(data)) {
			return 0;
		}
		Node temp = head;
		int count = 0;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			count++;
			if (temp.getData().equals(data)) {
				System.out.println("Word is present at :" + count);
				return count;
			}
		}
		return -1;
	}
}