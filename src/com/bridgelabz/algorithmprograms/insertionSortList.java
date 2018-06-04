package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class insertionSortList {
	/*
	 * public static void insertionSort(String[] list) { for (int top = 1; top <
	 * list.length; top++) { String item = list[top]; int i = top; while (i > 0 &&
	 * item.compareTo(list[i - 1]) < 0) { list[i] = list[i - 1]; i--; } list[i] =
	 * item; System.out.print(list[0]); System.out.print(" ");
	 * System.out.print(list[1]); System.out.print(" "); System.out.print(list[2]);
	 * System.out.print(" "); System.out.print(list[3]); System.out.print(" ");
	 * System.out.print(list[4]); System.out.println(); } }
	 */
	public static void main(String[] args) {

		String[] list = new String[100];
		for (int top = 1; top < list.length; top++) {
			String item = list[top];
			int i = top;
			while (i > 0 && item.compareTo(list[i - 1]) < 0) {
				list[i] = list[i - 1];
				i--;
			}
			list[i] = item;
			System.out.print(list[0]);
			System.out.print(" ");
			System.out.print(list[1]);
			System.out.print(" ");
			System.out.print(list[2]);
			System.out.print(" ");
			System.out.print(list[3]);
			System.out.print(" ");
			System.out.print(list[4]);
			System.out.println();
		}
	}
}
