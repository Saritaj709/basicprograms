package com.bridgelabz.datastructures;

public class Node<T> {
	public T data;
	public Node<T> next;
	public Node(T data)
	{
		this.data=data;
	}
	public Node()
	{
		data=null;
	}

}
