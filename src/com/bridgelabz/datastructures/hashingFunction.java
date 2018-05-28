package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.MyLinkedList;

public class hashingFunction {
	public static void main(String[] args) {
		MyLinkedList[] hashtable = new MyLinkedList[100];
		MyLinkedList list = new MyLinkedList();
		File fi = new File("/home/bridgelabz/JSarita/DataStructures/hashtable");
		FileReader fr = null;
		BufferedReader br = null;
		String[] str = new String[100];
		String word = "";
		int count = 0;
		for(int i=0;i<11;i++)
			hashtable[i]=new MyLinkedList();
		try {
			fr = new FileReader(fi);
			br = new BufferedReader(fr);
			word = br.readLine();
			while (word != null) {
				str = word.split(",");
				count++;
				break;
			}
			Integer[] integers = new Integer[str.length];
			for (int i = 0; i < integers.length; i++)
				integers[i] = Integer.parseInt(str[i]);
			Integer[] sorted = new Integer[100];
			sorted = Utility.bubbleSort(integers);
			for (int i = 0; i < sorted.length; i++)
				list.add(sorted[i]);

			list.display();
			
			System.out.println("enter the element to search in the linked list");
			int number = Utility.userInt();
			int valueAt = list.search(number);
			if (valueAt == -1) {
				System.out.println("adding the element to the list");
				//list.add(number);
				for(int i=0;i<11;i++)
				{	if(number%11==i)
						hashtable[i].add(number);
				}
					/*if(number%11==0)
						hashtable[1].add(number);
					else if(number%11==1)
						hashtable[1].add(number);
					else if(number%11==2)
						hashtable[2].add(number);
					else if(number%11==3)
						hashtable[3].add(number);
				
					else if(number%11==4)
						hashtable[4].add(number);
					else if(number%11==5)
						hashtable[5].add(number);
					else if(number%11==6)
						hashtable[6].add(number);
					else if(number%11==7)
						hashtable[7].add(number);
					else if(number%11==8)
						hashtable[8].add(number);
					else if(number%11==9)
						hashtable[9].add(number);
					else hashtable[10].add(number);
					*/
						System.out.println("number added successfully");
				System.out.println("new list size becomes :");
				System.out.println(list.size());
				System.out.println("The elements are:");
				FileWriter fw = new FileWriter(fi);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(word + "," + number);
				bw.flush();
				list.display();
			} else {
				list.remove(valueAt);
				System.out.println("element removed successfully");
				System.out.println("The new list elements are:");
				list.display();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
