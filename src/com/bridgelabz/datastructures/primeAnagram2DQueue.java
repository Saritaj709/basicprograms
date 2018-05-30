/*****************************************************************************
 * Compilation:  javac -d bin prime2DQueue.java
 *  Execution:    java -cp bin com.bridgelabz.util.prime2DQueue.java 0 to 1000
 * Purpose:to generate 2D array of a linkedlist and store prime no.s in 
           first array and normal no.s in 2nd array and print them uing queue
 *   @author  Sarita
 *  @version 1.0
 *  @since  05-30-2018         
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class primeAnagram2DQueue {
	    public static void main(String[] args) {
	        MyLinkedList[][] array = new MyLinkedList[100][];
	        QList qlist = new QList();
	        for (int i = 0; i < 10; i++) {
	            array[i] = new MyLinkedList[100];
	            for (int j = 0; j < 100; j++) {
	                array[i][j] = new MyLinkedList();
	            }
	        }
	        for (int i = 0; i < 10; i++) {
	            for (int j = 100 * i; j < 100 * (i + 1) - 1; j++) {
	                int k = 0;
	                if (Utility.findPrime(j) == true) {
	                    for (int m = j + 1; m < 100 * (i + 1); m++) {
	                        if (Utility.isAnagram(("" + j), ("" + m)) == true) {
	                            qlist.enqueue(m);
	                            qlist.enqueue(j);
	                        }
	                    }
	                }
	            }

	        }
	        qlist.display();
	    }
	}
