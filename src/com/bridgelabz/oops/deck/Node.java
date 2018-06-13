package com.bridgelabz.oops.deck;

/*********************************************************************************
	 * 
	 * Purpose: to make a Node
	 * 
	 * @author Sarita
	 * @version 1.0
	 * @since 13/06/2018
	 *********************************************************************************/
	/**
	 * @author 
	 * Class Node
	 * @param <T>
	 */
	public class Node<T> {
	public T data;
	public Node<T> next;
	/**
	 * Parameterized Constructor
	 * @param data
	 */
	public Node(T data)
	{
		this.data=data;
	}
	/**
	 * Constructor
	 */
	public Node()
	{
		data=null;
	}
	}
