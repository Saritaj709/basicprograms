/*****************************************************************************
 * Compilation:  javac -d bin primeNo2D.java
 *  Execution:    java -cp bin com.bridgelabz.util.primeNo2D.java 0 to 1000
 * Purpose:to generate 2D array of a linkedlist and store prime no.s
           that are anagram in first array and normal no.s in 2nd array 
           and print them
 *   @author  Sarita
 *  @version 1.0
 *  @since  05-29-2018         
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class primeNo2D {
		public static <T extends Comparable<T>> void main(String[] args) {
	        MyLinkedList<Integer> array[][] =  new MyLinkedList[11][];
	        for (int i = 0; i < 10; i++) {
	            array[i] = new MyLinkedList[100];
	            for (int j = 0; j < 100; j++) {
	                array[i][j] = new MyLinkedList();
	            }
	        }
	        for (int i = 0; i < 10; i++) {
	            int k = 0;
	            for (int j = 100 * i; j < 100 * (i + 1); j++) {
	                if (Utility.findPrime(j)) {
	                    array[i][k].add(j);
	                    k++;
	                }
	            }
	        }
	        for (int i = 0; i < 10; i++) {
	            System.out.print(i + " " + "|");
	            for (int j = 0; j < 100; j++) {
	                array[i][j].display();
	            }
	        }
	    }

	
	}