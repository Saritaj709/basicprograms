package com.bridgelabz.algorithmprograms;

import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class insertionSortList {
	static List<Integer> list = new LinkedList<>();
	static int[] array;

	public static void main(String[] args) {

		System.out.println("enter the no. of elements ");
		int number = Utility.userInt();
		System.out.println("enter the elements int list");
		for (int i = 0; i < number; i++) {
			list.add(Utility.userInt());

		}
		array = new int[list.size()];
		System.out.println("before sorting elements are : ");
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
			System.out.println(array[i]);
		}

		System.out.println("list elements after sorting are : ");
		Utility.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
