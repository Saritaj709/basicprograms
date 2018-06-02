/*****************************************************************************
 *  Compilation:  javac -d bin palindromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.palindromeChecker.java  string
 *  Purpose:Displays true if string is palindrome else false
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-24-2018
 *
 ******************************************************************************/
package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.println("enter the string");
		String str = Utility.userString();
		int count = 0;
		char[] ch = str.toCharArray();
		Deque<String> dq = new Deque<>();
		for (int i = 0; i < ch.length; i++) {
			dq.addFront(ch[i]);
			dq.display();
			count++;
		}
		System.out.println(count);
		int size = dq.size() / 2;
		for (int i = 0; i < size; i++) {
			if (!dq.removeFront().equals(dq.removeRear())) {
				System.out.println("not palindrome");
				break;
			} else
				System.out.println("palindrome");
			break;
		}

	}
}
