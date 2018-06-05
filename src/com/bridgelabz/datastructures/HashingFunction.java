/*****************************************************************************
 * Compilation:  javac -d bin HashingFunction.java
 *  Execution:    java -cp bin com.bridgelabz.util.HashingFunction.java File
 * Purpose:to read an integer input,divide it by 11 and store in a hashmap 
 * of array value 11,and to shore the no.s from 0 to 10th indices without repetitions
 *   @author  Sarita
 *  @version 1.0
 *  @since  05-27-2018         
 */

package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.bridgelabz.utility.Utility;

public class HashingFunction {
		static int count = 0;
	    static int rem = 0;

	    public static void main(String[] args) throws IOException {
	        MyLinkedList list = new MyLinkedList<>();
	        HashMap map = new HashMap<>();
	        String number = "";
	        @SuppressWarnings("rawtypes")
			MyLinkedList[] arrayList = new MyLinkedList[11];
	        for (int i = 0; i < arrayList.length; i++) {
	            arrayList[i] = new MyLinkedList<Integer>();
	        }
	        File f = new File("/home/bridgelabz/JSarita/DataStructures/hashtable");
	        FileReader fs = null;
	        ArrayList<String> a = new ArrayList<String>();
	        BufferedReader fo = null;
	        try {
	            fs = new FileReader(f);
	            fo = new BufferedReader(fs);
	            number = fo.readLine();
	            while (number != null) {
	                String[] str = number.split(",");
	                for (int i = 0; i < str.length; i++) {
	                    count++;
	                    a.add(str[i]);
	                }
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        int array[] = new int[a.size()];
	        for (int i = 0; i < a.size(); i++) {
	            array[i] = Integer.parseInt(a.get(i));
	        }
	        for (int i = 0; i < array.length; i++) {
	            list.add(array[i]);
	        }
	        list.display();
	        for (int i = 0; i < array.length; i++) {
	            Integer value = (Integer) list.removeFront();
	            rem = value % 11;
	            map.put(rem, value);
	        }
	        System.out.println(map.entrySet());
	        System.out.println("Enter the word to search in the linked list");
	        int number1 = 0;
	        number1 = Utility.userInt();
	        if (map.containsValue(number1)) {
	            int key = number1 % 11;
	            map.remove(key);
	            System.out.println("Word removed Successfully");
	            System.out.println(map.entrySet());
	        } else {
	            int key1 = number1 % 11;
	            map.put(key1, map.get(key1) + "," + number1);
	            System.out.println(map.entrySet());
	        }
	    }

	}

	  