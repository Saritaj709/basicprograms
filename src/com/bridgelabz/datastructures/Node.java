package com.bridgelabz.datastructures;

public class Node<T> {
	public Node prev;
	public Node next;
	protected Node link;
	private int data;

	public Node(T data) {
		this.data = (int) data;
		this.next = null;
	}

	public Node(T data, Node prev, Node next) {
		this.data = (int) data;
		this.prev = prev;
		this.next = next;
	}

	public Node(T data, Node link) {
		this.data = (int) data;
		this.link = link;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLink(Node n) {
		link = n;
	}

	public Node getLink() {
		return link;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
