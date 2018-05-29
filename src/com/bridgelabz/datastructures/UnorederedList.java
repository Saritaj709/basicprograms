/*****************************************************************************
 * Compilation:  javac -d bin unorderedList.java
 *  Execution:    java -cp bin com.bridgelabz.util.unorderedList.java File
 * Purpose:to read the text from a file,split it into words and arrange it as 
 *         linked list.Take a user input to search a word in the list.If the 
 *         Word is not found then add it to the list,and if it found then remove 
 *         the word from the List.At the end,save the list into a file.
 *   @author  Sarita
 *  @version 1.0
 *  @since  05-20-2018         
 */

package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class UnorederedList {
	public static void main(String[] args) throws IOException {
		MyLinkedList list = new MyLinkedList();
		File fi =new File("/home/bridgelabz/JSarita/DataStructures/list");
		FileReader fr=null;
		BufferedReader br=null;
		String word="";
		int count=0;
		try
		{
			fr=new FileReader(fi);
			br=new BufferedReader(fr);
			word=br.readLine();
			while(word!=null)
			{
				String[] str=word.split(",");
				count++;
				for(int i=0;i<str.length;i++) 
					list.add(str[i]);
				break;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
				}
		System.out.println("searching elements in list");
		list.display();
		System.out.println(list.size());
		String newword;
		System.out.println("enter the word to be searched from the list");
		newword=Utility.userString();;
		int pos=list.search(newword);
		System.out.println(pos);
		if(pos<list.size()&& pos>=0)
		{
			list.remove(pos);
			list.display();
			System.out.println("the new file is ");
			list.display();
			System.out.println("New list size :"+list.size());	
			}
	else
	{
		list.add(newword);
		list.display();
		System.out.println(list.size());
		FileWriter fw=new FileWriter(fi);
		BufferedWriter bw=new BufferedWriter(fw);
		String str1=word+","+newword;
		bw.write(str1);
		//;
		bw.close();
		System.out.println("The word is added to the file and list");
		System.out.println("the new file is--->");
		list.display();
	}
}
}