package com.bridgelabz.datastructures;

public class dequeOperations {
	  int MAX = 100;
	    int  arr[];
	    int  front;
	    int  rear;
	    int  size;
	     
	    public dequeOperations(int size)
	    {
	        arr = new int[MAX];
	        front = -1;
	        rear = 0;
	        this.size = size;
	    }
	   
	    boolean isFull()
	    {
	        return ((front == 0 && rear == size-1)||
	            front == rear+1);
	    }
	    boolean isEmpty ()
	    {
	        return (front == -1);
	    }
	    
	    void insertFront(int val)
	    {
	       if(isFull())
	       {
	    	   System.out.println("overflow");
	    	   return;
	       }
	  
	        // If queue is initially empty
	        if(front==-1)
	        {
	        	front=0;
	        	rear=0;
	        }
	         
	        // front is at first position of queue
	        else if(front==0)
	         front=size-1;
	  
	        else // decrement front end by '1'
	            front=front-1;
	        arr[front] = val ;
	    }
	    
	   int insertRear(int val)
	    {
	        if(isFull())
	        {
	        System.out.println("overflow");
	        return 0;
	        }
	        // If queue is initially empty
	       if(front==-1)
	       {
	    	   front=0;
	    	   rear=0;
	       }
	        // rear is at last position of queue
	       else if(rear==size-1)
	    	   rear=0;
	        // increment rear end by '1'
	       else 
	    	   rear=rear+1;
	        arr[rear]=val;
	        return arr[rear];
	    }
	    
	    void deleteFront()
	    {  
	    	if(isEmpty())
	    	{
	    		System.out.println("Queue underflow\n");
	    		return;
	    	}
	        // Deque has only one element
	       if(front==rear)
	       {
	    	   front=-1;
	    	   rear=-1;
	       }
	        // back to initial position
	       else if(front==size-1)
	    	   front=0;
	       else
	    	   front=front+1;
	    }
	    void deleteRear()
	    {
	       if(isEmpty())
	       {
	    	   System.out.println("underflow");
	    	   return;
	       }
	  
	        // Deque has only one element
	       if(front==rear)
	       {
	    	   front=-1;
	    	   rear=-1;
	       }
	       else if(rear==0)
            rear=size-1;
	       else
	    	   rear=rear-1;
	    }
	    
	    int getFront()
	    {
	        if(isEmpty())
	        {
	        	System.out.println("underflow");
	        	return -1;
	        }
	        return arr[front];
	    }
	    int getRear()
	    {
	    	if(isEmpty()||rear<0)
	    	{
	    System.out.println("underflow");
	    	return -1;
	    }
	    	return arr[rear];
	    }
}  



