package com.bridgelabz.datastructures;

import com.bridgelabz.Ulist.ListUtility;
import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility1;
import java.util.Scanner;

public class orderedList {
	// Java program to sort link list
	// using insertion sort
        node head;
	    node sorted;
	 
	    class node 
	    {
	        int val;
	        node next = null;
			//public int data;
	 
	        public node(int val) 
	        {
	            this.val = val;
	        }
	    }
	 
	    void push(int val) 
	    {
	        /* allocate node */
	        node newnode = new node(val);
	        /* link the old list off the new node */
	        newnode.next = head;
	        /* move the head to point to the new node */
	        head = newnode;
	    }
	 
	    // function to sort a singly linked list using insertion sort
	    void insertionSort(node headref) 
	    {
	        // Initialize sorted linked list
	        sorted = null;
	        node current = headref;
	        // Traverse the given linked list and insert every
	        // node to sorted
	        while (current != null) 
	        {
	            // Store next for next iteration
	            node next = current.next;
	            // insert current in sorted linked list
	            sortedInsert(current);
	            // Update current
	            current = next;
	        }
	        // Update head_ref to point to sorted linked list
	        head = sorted;
	    }
	 
	    /*
	     * function to insert a new_node in a list. Note that 
	     * this function expects a pointer to head_ref as this
	     * can modify the head of the input linked list 
	     * (similar to push())
	     */
	    void sortedInsert(node newnode) 
	    {
	        /* Special case for the head end */
	        if (sorted == null || sorted.val >= newnode.val) 
	        {
	            newnode.next = sorted;
	            sorted = newnode;
	        }
	        else
	        {
	            node current = sorted;
	            /* Locate the node before the point of insertion */
	            while (current.next != null && current.next.val < newnode.val) 
	            {
	                current = current.next;
	            }
	            newnode.next = current.next;
	            current.next = newnode;
	        }
	    }
	 
	    /* Function to print linked list */
	    void printlist(node head) 
	    {
	        while (head != null) 
	        {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	    }
	    static int binarySearch(int arr[], int low, int high, int key)
	    {
	       if (high < low)
	           return -1;
	         
	        /*low + (high - low)/2;*/          
	       int mid = (low + high)/2;  
	       if (key == arr[mid])
	           return mid;
	       if (key > arr[mid])
	           return binarySearch(arr, (mid + 1), high, key);
	       return binarySearch(arr, low, (mid -1), key);
	    }
	  
	    // Driver program to test above functions
	    public static void main(String[] args) 
	    {
	    	int data=40;
	    	Scanner sc=new Scanner(System.in);
	    	Node newNode=new Node();
	        orderedList list = new orderedList();
	        System.out.println("ENTER THE NO. OF ELEMENTS TO INSERT IN LIST");
	        int n=sc.nextInt();
	        //int arr[]=new int[n];
	        int arr[]= {2,3,6,9,10,23,50,20,13};
	        if(n>0) {
	        System.out.println("Enter the elements into list");
	        for(int i=0;i<n;i++)
	        list.push(arr[i]);
	        }
	        /*list.push(20);
	        list.push(4);
	        list.push(3);
	        list.push(30);*/
	        System.out.println("Linked List before Sorting..");
	        list.printlist(list.head);
	        list.insertionSort(list.head);
	        System.out.println("\nLinkedList After sorting\n");
	        list.printlist(list.head);
	        System.out.println("\nenter the element to be searched\n");
	        int search=sc.nextInt();
	        System.out.println("\nelement to be searched is"+search);
	       
	         int i=0;
	       int index=binarySearch(arr,0, n, search);
	       if(arr[index]==search)
	       {
	        	System.out.println("element is found at index "+index);
	        		ListUtility.deleteNode(search);
	        	System.out.println("element matched,deleting"); 	
	        System.out.println("new list is");
	        list.printlist(list.head);
	       }
	       if(arr[index]!=search)
	        	{ 
	        		list.push(search);
	        		System.out.println("\nelement not matched,adding the element to the list");
	        	 
		         list.insertionSort(list.head);
		        System.out.println("new list is");
		        list.printlist(list.head);
		        }
	        }
	    }


