package com.bridgelabz.Ulist;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;

import com.bridgelabz.utility.Node;

public class ListUtility
{
public Node readFile(Node start)
{
	try {
		FileInputStream fis=new FileInputStream("/home/bridgelabz/JSarita/DataStructures/list");
		char ch;
		String word3="";
		while(fis.available()>0)
		{
			ch=(char)fis.read();
			word3=word3+ch;
		}
	String[] wordsArray=word3.split(" ");
	for(int i=0;i<wordsArray.length;i++)
	{
		start=addWordstoList(start,wordsArray[i]);
	}
	}
	catch(NullPointerException ne)
	{
		System.out.println(ne);
	}
	catch(IOException e)
	{
	}
	return start;
}//end of read method

//Insert Words
public Node addWordstoList(Node node1,String str)
{
	Node node2=node1;
	Node newNode=new Node();
	newNode.data1=str;
	newNode.nextNode=null;
	if(node1==null)
	{
		return newNode;
		}
	else
	{
		while(node1.nextNode!=null)
		{
			node1=node1.nextNode;
		}
		node1.nextNode=newNode;
	}
	return node2;
}
// End of insert method

// Search Words
public Node searchData(Node node,String word)
{
	Node temp=node;
	while(node.nextNode!=null)
	{
		if(word.compareTo((node.nextNode).data1)==0)
		{
			node.nextNode=(node.nextNode).nextNode;
			System.out.println("Word is found");
			System.out.println("the word found is deleted from the file");
			System.out.println("file saved");
			return temp;
		}
		node=node.nextNode;
		//System.out.println("The list of words to file are:"+temp);
	}
   System.out.println("word is not found");
   System.out.println("the word not found is added to the file");
   System.out.println("File saved");
   temp=addWordstoList(temp,word);
   return temp;
   
}//end of search word

public void writeDataToFile(String nWord)
{
	try {
		File fi=new File("/home/bridgelabz/JSarita/DataStructures/list");
		fi.createNewFile();
		FileWriter fw=new FileWriter(fi);
		fw.write(nWord);
		fw.close();
	}
	catch(IOException e)
	{
	}
}
//a function to insert a newnode in a list //
/* function to insert a new_node in a list. */
public static void sortedInsert(Node new_node)
{
     Node current;
     Node head = null;
     Node next;

     /* Special case for head node */
     if (head == null || head.data >= new_node.data)
     {
        new_node.next = head;
        head = new_node;
     }
     else {

        /* Locate the node before point of insertion. */
        current = head;

        while (current.next != null &&
               current.next.data < new_node.data)
              current = current.next;

        new_node.next = current.next;
        current.next = new_node;
     }
 }
/* Function to create a node */
Node newNode(int data)
{
   Node x = new Node();
   return x;
}

 /* Function to print linked list */
 public static void printList()
 {
     Node head = null;
	Node temp = head;
     while (temp != null)
     {
        System.out.print(temp.data+" ");
        temp = temp.next;
     }
 }
 // delete an element from a node //
 public static void deleteNode(int key)
 {
     Node head = null;
	// Store head node
     Node temp = head, prev = null;

     // If head node itself holds the key to be deleted
     if (temp != null && temp.data == key)
     {
         head = temp.next; // Changed head
         return;
     }

     // Search for the key to be deleted, keep track of the
     // previous node as we need to change temp.next
     while (temp != null && temp.data != key)
     {
         prev = temp;
         temp = temp.next;
     }    

     // If key was not present in linked list
     if (temp == null) return;

     // Unlink the node from linked list
     prev.next = temp.next;
 }
}



