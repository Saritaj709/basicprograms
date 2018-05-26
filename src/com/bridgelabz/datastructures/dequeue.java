package com.bridgelabz.datastructures;
import java.util.*;

public class dequeue
	{
	    public static void main(String[] args)
	    {
	        Deque deque = new LinkedList<>();
	   int n;
	        // We can add elements to the queue in various ways
	        Scanner sc=new Scanner(System.in);
	       /*System.out.println("enter n");
	        n=sc.nextInt();
	        int arr[]=new int[n];*/
	       /* deque.add("Element 1 (Tail)"); // add to tail
	        deque.addFirst("Element 2 (Head)");
	        deque.addLast("Element 3 (Tail)");
	        deque.push("Element 4 (Head)"); //add to head
	        deque.offer("Element 5 (Tail)");
	        deque.offerFirst("Element 6 (Head)");
	        deque.offerLast("Element 7 (Tail)");*/
	        System.out.println("enter the string");
	        String str=sc.nextLine();
	        System.out.println("inserting the characters");
	        for(int i=0;i<str.length();i++)
	        deque.push(str.charAt(i));
	        
	 
	        System.out.println(deque + "\n");
	 
	        // Iterate through the queue elements.
	        System.out.println("Standard Iterator");
	        Iterator iterator = deque.iterator();
	        while (iterator.hasNext())
	            System.out.println("\t" + iterator.next());
	 
	 
	        // Reverse order iterator
	        Iterator reverse = deque.descendingIterator();
	        System.out.println("Reverse Iterator");
	        while (reverse.hasNext())
	            System.out.println("\t" + reverse.next());
	        
	        if((deque.iterator())!=(deque.descendingIterator()))
	        {
	        	System.out.println("the given string "+str +" is palindrome");
	        }
	        else if(deque.iterator()==(deque.descendingIterator()))
	        {
	        	System.out.println("The given string "+str +" is not palindrome");;
	        }
	 
	        // Peek returns the head, without deleting
	        // it from the deque
	        System.out.println("Peek " + deque.peek());
	        System.out.println("After peek: " + deque);
	 
	        // Pop returns the head, and removes it from
	        // the deque
	        System.out.println("Pop " + deque.pop());
	        System.out.println("After pop: " + deque);
	 
	        // We can check if a specific element exists
	        // in the deque
	       System.out.println("Contains element 3: " +
	                        deque.contains("Element 3 (Tail)"));
	 
	        // We can remove the first / last element.
	        deque.removeFirst();
	        deque.removeLast();
	        System.out.println("Deque after removing " +
	                            "first and last: " + deque);
	 
	    }
	}
