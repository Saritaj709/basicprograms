package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class primeAnagram2D {
	public static void main(String[] args)
	{
		        MyLinkedList[][] array = new MyLinkedList[100][];
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
		                            array[i][k].add(j);
		                            k++;
		                            System.out.println("[" + j + "," + m + "]");
		                        }
		                    }
		                }
		            }

		            System.out.println();
		        }
		    }
		}