/*****************************************************************************
	 * Compilation:  javac -d bin orderedList.java
	 *  Execution:    java -cp bin com.bridgelabz.util.orederedList.java File
	 * Purpose:to read the text from a file,split it into words,change to integers,sort it and arrange it as 
	 *         linked list.Take a user input to search a word in the list.If the 
	 *         Word is not found then add it to the list,and if it found then remove 
	 *         the word from the List.At the end,save the list into a file.
	 *   @author  Sarita
	 *  @version 1.0
	 *  @since  05-20-2018         
	 */

package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		MyLinkedList list = new MyLinkedList();
		File fi = new File("/home/bridgelabz/JSarita/DataStructures/orderedlist");
		FileReader fr = null;
		BufferedReader br = null;
		String[] str = new String[100];
		String word = "";
		try {
			fr = new FileReader(fi);
			br = new BufferedReader(fr);
			word = br.readLine();
			while (word != null) {
				str = word.split(",");
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
			System.out.println("enter th element to search in the linked list");
			int number = Utility.userInt();
			int valueAt = list.search(number);
			if (valueAt == -1) {
				System.out.println("adding the element to the list");
				list.add(number);
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
