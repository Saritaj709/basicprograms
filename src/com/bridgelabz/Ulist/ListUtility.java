package com.bridgelabz.Ulist;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;

import com.bridgelabz.utility.Node;

public class ListUtility
{
public static Node readFile(Node start)
{
	try {
		FileInputStream fis=new FileInputStream("/home/JSarita/javapgm/src/com/bridgelabz/DataStructures");
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
public static Node addWordstoList(Node node1,String str)
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
public static Node searchData(Node node,String word)
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
	}
   System.out.println("word is not found");
   System.out.println("the word not found is added to the file");
   System.out.println("File saved");
   temp=addWordstoList(temp,word);
   return temp;
}//end of search word

public static void writeDataToFile(String nWord)
{
	try {
		File fi=new File("/home/bridgelabz/JSarita/DataStructures/list.txt");
		fi.createNewFile();
		FileWriter fw=new FileWriter(fi);
		fw.write(nWord);
		fw.close();
	}
	catch(IOException e)
	{
	}
}
}