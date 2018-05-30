package com.bridgelabz.utility;

import java.util.Scanner;
import java.awt.SystemColor;
import java.io.PrintWriter;
import java.lang.Math;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {
	/**
	 * static variable is declared to create static object of Scanner class
	 */
	static Scanner sc = new Scanner(System.in);

	public static int userInt() {
		try {
			int n = sc.nextInt();
			return n;
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("Invalid input,enter again");
			return userInt();
		}
	}

	public static String userString() {
		String str = sc.nextLine();
		return str;
	}
 public static char userChar()
 {
	 char[] ch=sc.next().toCharArray();
	 
	 try
	 {
		 if(ch.length>1)
		 ch=sc.nextLine().toCharArray();
	 }
	 catch(Exception e)
	 {
		System.out.println("invalid input");
	 }
	 return ch[0];
 }
	public static double userDouble() {
		try {
			double n = sc.nextDouble();
			return n;
		} catch (Exception e) {
			sc.nextLine();
			System.out.println("Invalid input,enter again");
			return userDouble();
		}
	}

	/******************************************************************************/
	// Count of triplets implementation or Sum of three integer adds to zero
	// implementation //
	/**
	 * @param a[]
	 *            is an array of integers
	 * @param x
	 *            is the index of last array
	 */

	public static void countTriplets(int a[], int x) {
		int count = 0;
		for (int i = 0; i < x - 2; i++) {
			for (int j = i + 1; j < x - 1; j++) {
				for (int k = j + 1; k < x; k++) {
					if (a[i] + a[j] + a[k] == 0)
						count++;
					System.out.println(a[i] + " " + a[j] + " " + a[k]);
				}
			}
		}
		System.out.println("No.of triplets:" + count);
	}

	/***********************************************************************************/
	// PermutationOfString implementation//
	/**
	 * 
	 * @param str
	 *            is the user String input
	 * @param start
	 *            is the initial index of str
	 * @param end
	 *            is the final index of str
	 */

	public static void permute(String str, int start, int end) {
		if (start == end)
			System.out.println(str);
		else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i);
			}
		}

	}

	/**
	 * 
	 * @param a
	 *            is String input
	 * @param i
	 *            is initial index of a
	 * @param j
	 *            is final index of a
	 * @return value of charArray
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*******************************************************************************/
	// 2D Array Implementation //
	/**
	 * 
	 * @param rows
	 *            no. of rows
	 * @param cols
	 *            no. of cols
	 * @return 2D array of particular value of rows and cols
	 */
	public static int[][] arrayInt(int rows, int cols) {
		int a[][] = new int[rows][cols];

		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

	public static double[][] arrayDouble(int rows, int cols) {
		double b[][] = new double[rows][cols];

		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc.nextDouble();
			}
		}
		return b;
	}

	public static String[][] arrayBoolean(int rows, int cols) {
		String c[][] = new String[rows][cols];

		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = sc.nextLine();
			}
		}
		return c;
	}

	// display method
	public static void display(int[][] a, double[][] b, String[][] c, int rows, int cols) {
		PrintWriter pw = new PrintWriter(System.out, true);

		// display integers
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
		}

		// display double
		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				pw.print("\t" + b[i][j] + " ");
			}
			pw.println("\t");
		}

		// display boolean
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println("\t");
		}
	}

	/************************************************************************/
	// stop watch implementation//
	/**
	 * @param start
	 *            is the start time of stopWatch
	 * @param end
	 *            is the end time of stopWatch
	 */

	static String[] board;
	static String turn;
	private static int value;
	private static String[] getCoupon;

	public static void stopWatch() {
		long start = System.nanoTime();
		System.out.println(" ");
		long end = System.nanoTime();
		System.out.println("calculating time from " + start + "nano secs" + end + "micro sec");

		long total_time = end - start;
		System.out.println("Time measured is:  " + total_time + "nano secs");

	}

	// Timer functions
	public static long startTimer() // Start
	{
		System.out.println("Timer started....");
		long startTime = System.nanoTime();
		return startTime;
	}

	public static long endTimer() // end
	{
		System.out.println("Timer ended......");
		long endTime = System.nanoTime();
		return endTime;
	}

	/************************************************************************/
	// Quadratic_Equation implementation //
	/**
	 * @param a
	 *            is a double input
	 * @param b
	 *            is a double input
	 * @param c
	 *            is a double input
	 */
	public static void quadratic() {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta, Root1, Root2;
		delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Roots are imaginary");
		} else if (delta > 0) {
			Root1 = (-b + Math.sqrt(delta)) / (2 * a);
			Root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Root1:" + Root1);
			System.out.println("Root2:" + Root2);
		}

	}

	/******************************************************************/
	// Coupon Number implementation//
	/**
	 * @param n
	 *            is the no. of times the coupon is generated
	 * @return coupon no.
	 */
	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = getCoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		for (int i = 1; i < n; i++)
			System.out.println("coupon no. are:" + getCoupon(count));
		return count;
	}

	/***********************************************************************/
	/*
	 * public String createRandomCode(int codeLength) { char[]
	 * ch="abcdefghijklmnopqrst1234567890".toCharArray(); StringBuilder sb=new
	 * StringBuilder(); Random r=new SecureRandom(); for(int i=0;i<codeLength;i++) {
	 * char c=(char)[r.nextInt(ch.length)]; sb.append(c); } String
	 * output=sb.toString(); System.out.println(output); return output; }
	 */
	/*********************************************************************************/
	/**
	 * @param String
	 *            name takes,user input which is to be replaces <<username>>
	 */
	public static void stringTemplate(String name) {
		String str = "Hello <<username>> How are you ?";
		str = str.replace("<<username>>", name);
		System.out.println(str);
	}

	/*********************************************************************/

	// FlipCoin implementation //

	/**
	 * @param int
	 *            numFlips takes no. of times the coin will flip
	 */
	public static void flipCoin() {
		int loopCount = 1;
		int numFlips;
		int head = 0;
		System.out.println("enter no. of times to flip coin");
		numFlips = sc.nextInt();
		while (loopCount <= numFlips) {
			double result = Math.random();
			if (result <= .5)
				head++;
			loopCount++;
		}
		double percentHead = (head * 100) / numFlips;
		double percentTails = ((numFlips - head) * 100) / numFlips;
		System.out.println("Head percentage=" + percentHead + "%");
		System.out.println("Tail percentage=" + percentTails + "%");
	}

	/****************************************************************************/
	// LeapYear implementation //
	/**
	 * @param int
	 *            year takes year as input
	 */
	public static void leapYear() {
		System.out.print("Enter any year:");
		int year = sc.nextInt();
		boolean flag = false;
		if (year % 400 == 0)
			flag = true;
		else if (year % 100 == 0)
			flag = false;
		else if (year % 4 == 0)
			flag = true;
		else
			flag = false;
		if (flag)
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	}

	/****************************************************************************/
	// Power2 implementation //
	/**
	 * @param N
	 *            takes input as no. of times the power of 2 should be calculated
	 */
	public static void power2(int N) {
		if (N < 0 || N > 30)
			System.out.print("invalid input");
		else {
			for (int i = 0; i <= N; i++) {
				System.out.println("2^ " + i + "=" + Math.pow(2, +i));
			}

		}
	}

	/*************************************************************************/
	// Harmonic Number implementation //
	/**
	 * @param N
	 *            takes the nth value till which sum of harmonic no. should be
	 *            determined
	 */

	public static void harmonicNumber() {
		double N;
		double sum = 0.0;
		System.out.println("enter the value of N till where sum is to be calculated");
		N = sc.nextInt();
		System.out.println("N value :" + N);
		if (N == 0)
			System.out.println("invalid");
		for (double i = 1; i <= N; i++)
			sum = sum + 1 / N;
		System.out.println("Sum of values " + sum);
	}

	/*************************************************************************/

	// Prime Factors implementation //
	/**
	 * @param n
	 *            takes no. as an input value whose prime factors is to be
	 *            determined
	 */

	public static void primeFactors() {
		int n;
		System.out.println("enter the no.");
		n = sc.nextInt();
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n /= 2;
		}
		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				System.out.println(i);
				n /= i;
			}

		}

		if (n > 2) {
			System.out.println(n);
		}
	}

	/************************************************************************/

	// Gambler program implementation //
	/**
	 * @param $Stake
	 *            takes the cash the player is having
	 * @param $goal
	 *            takes the cash amount where bet is won
	 * @param noOfTimes
	 *            takes the no. of times the game is to be played
	 */

	public static void gambler() {
		int $Stake, $Goal, noOfTimes;
		System.out.println("enter $stake");
		$Stake = sc.nextInt();
		System.out.println("enter $goal");
		$Goal = sc.nextInt();
		System.out.println("enter noOfTimes");
		noOfTimes = sc.nextInt();
		double bets = 0, noOfWins = 0, noOfLoose = 0;
		if (noOfTimes > 0) {
			while ($Stake > 0 && $Stake != $Goal) {
				if (Math.random() > 0.5) {
					bets++;
					$Stake = $Stake + 1;
					System.out.println("won");
				} else {
					$Stake = $Stake - 1;
					System.out.println("loose");
				}
			}
			System.out.println();
			System.out.println(noOfWins + " wins " + noOfTimes + "number of times");
			System.out.println(noOfLoose + "loose" + noOfTimes + "number of times");
			System.out.println("Percentage of game won= " + (noOfWins * 100) / (noOfWins + noOfLoose));
			System.out.println("Percentage of game loosed=" + (noOfLoose * 100) / (noOfWins + noOfLoose));
			System.out.println("avg. no. of bets= " + bets / noOfTimes);
		}
	}

	/***************************************************************************/
	// Euclidean distance implementation //
	/**
	 * @param x
	 *            is the x-coordinate
	 * @param y
	 *            is the y-coordinate
	 */

	public static void distance1(double x, double y) {
		double distance = Math.pow(x, 2) + Math.pow(y, 2);
		System.out.println(Math.sqrt(distance));
	}

	/********************************************************************/
	// Windchill implementation //
	/**
	 * @param t
	 *            is temperature value
	 * @param v
	 *            is velocity value
	 */

	public static void windChill(double t, double v) {
		if (t > 50 || v < 3 || v > 120) {
			System.out.println("invalid inputs,enter valid inputs");
		} else {
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("WindChill " + w);
		}
	}

	/***********************************************************************/
	// TicTacToeCross game implementation //
	/**
	 * @param x
	 *            is the x-coordinate of board
	 * @param y
	 *            is the y-coordinate of board
	 * @param player
	 *            is X or O who plays the game
	 */

	public static final int X = 1, O = -1;
	public static final int EMPTY = 0;

	public int player = X;
	public int[][] board1 = new int[3][3];
	public boolean isEmpty = false;

	public void putSign(int x, int y) {
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			System.out.println("Invalid board position");
			return;
		}
		if (board1[x][y] != EMPTY) {
			System.out.println("Board position occupied");
			return;
		}
		board1[x][y] = player;
		player = -player;
	}

	public boolean isWin(int player) {
		return ((board1[0][0] + board1[0][1] + board1[0][2] == player * 3)
				|| (board1[1][0] + board1[1][1] + board1[1][2] == player * 3)
				|| (board1[2][0] + board1[2][1] + board1[2][2] == player * 3)
				|| (board1[0][0] + board1[1][0] + board1[2][0] == player * 3)
				|| (board1[0][1] + board1[1][1] + board1[2][1] == player * 3)
				|| (board1[0][2] + board1[1][2] + board1[2][2] == player * 3)
				|| (board1[0][0] + board1[1][1] + board1[2][2] == player * 3)
				|| (board1[2][0] + board1[1][1] + board1[0][2] == player * 3));
	}

	public void displayWinner() {
		if (isWin(X)) {
			System.out.println("\n X wins...!!");
			isEmpty = false;
		} else if (isWin(O)) {
			System.out.println("\n O wins...!!");
			isEmpty = false;
		} else {
			if (!isEmpty) {
				System.out.println("its a tie");
			}

		}
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board1[i][j]) {
				case X:
					s.append(" X ");
					break;
				case O:
					s.append(" O ");
					break;
				case EMPTY:
					s.append("   ");
					isEmpty = true;
					break;
				}
				if (j < 2) {
					s.append("|");
				}

			}
			if (i < 2) {
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}

	/**************************************************************/
	// Algorithm Programs
	/**************************************************************************/
	// First Program
	/******************************************************************/

	// Two detect of two strings are Anagram (having same characters in both) //
	/**
	 * @param s1
	 *            is the first string
	 * @param s2
	 *            is the 2nd string
	 */
	public static void anagramDetection(String s1, String s2) {
		boolean isAnagram = false;
		if (s1.length() == s2.length()) {
			char[] s1AsChar = s1.toCharArray();
			char[] s2AsChar = s2.toCharArray();
			Arrays.sort(s1AsChar);
			Arrays.sort(s2AsChar);
			isAnagram = Arrays.equals(s1AsChar, s2AsChar);
			if (isAnagram == true)
				System.out.println("Strings are anagram");
			else
				System.out.println("Strings are not anagram");
		}

	}

	/************************************************************************/
	// To find Prime numbers from 0 to 1000
	/**
	 * @param i
	 *            is the first/outer loop index
	 * @param j
	 *            is the second/inner loop index
	 */
	public static void primeNumbers() {
		int i;
		for (i = 0; i <= 1000; i++) {
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {// System.out.println("Not a prime no.");
					break;
				}
			}
			System.out.println("prime no.s are:" + i);
		}
	}

	/**************************************************************************/
	// Prime numbers that are anagram and palindrome
	/**
	 * @param num
	 *            is the original number which is given as input
	 * @param dupNum
	 *            is the no. generated by system
	 * @return true if given prime no. are anagram and palindrome
	 */

	public static boolean oneDigit(int num) {
		return (num >= 0 && num < 10);
	}

	public static boolean isPalUtil(int num, int dupNum) {
		if (oneDigit(num))
			return (num == (dupNum) % 10);
		if (!isPalUtil(num / 10, dupNum))
			return false;
		dupNum /= 10;
		return (num % 10 == (dupNum % 10));
	}

	public static boolean isPal(int num) {
		if (num < 0)
			num = -num;
		int dupNum = num;
		return isPalUtil(num, dupNum);
	}

	public static void printPalPrime(int n) {
		boolean prime[] = new boolean[n + 1];
		Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) {
			if (prime[p])
				for (int i = p * 2; i <= n; i += p) {
					prime[i] = false;
				}
		}

		for (int p = 2; p <= n; p++) {
			if (prime[p] && isPal(p)) {
				System.out.print(p + " ");
			}
		}
	}

	/**********************************************************************/
	// Sorting Techniques(binary search,insertion sort,bubble sort)
	/**
	 * @param arr1[]
	 *            is the array of input integers
	 * @param n
	 *            is the length of input array
	 * @param search
	 *            is the no. which is to be searched from the array returns -1 if
	 *            element not present in array else returns the particular index
	 */
	public static void BinarySearchMethodInt() {
		int arr1[] = { 2, 3, 4, 10, 40 };
		int n = arr1.length;
		int search = 10;
		int result = binarySearch(arr1, 0, n - 1, search);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	/**
	 * @param arr
	 *            is the array of integers
	 * @param start
	 *            is the start index
	 * @param end
	 *            is the end index
	 * @param search
	 *            is the element which is to be searched
	 * @return the index of array where the element is to be found
	 */
	static int binarySearch(int arr[], int start, int end, int search) {
		if (end >= start) {
			int mid = start + (end - start) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == search)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > search)
				return binarySearch(arr, start, mid - 1, search);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, end, search);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	/**************************************************************************/
	/**
	 * @param arr[]
	 *            is the array of input elements
	 */
	public static void insertionSortInt() {
		int arr[] = { 12, 11, 13, 5, 6 };

		sort(arr);

		printArray(arr);
	}

	/* Function to sort array using insertion sort */
	/**
	 * @param arr
	 *            is the array of input elements
	 * @param n
	 *            is the length of integers
	 */
	public static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n */
	/**
	 * @param arr
	 *            is the array of input integers
	 */
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/*****************************************************************/
	// Insertionsort for String //
	/**
	 * @param inputarray
	 *            is the array of input Strings
	 */
	public static void insertionsortString() {
		int i, j;
		String key;
		String[] inputArray = { "E", "D", "C", "B", "A", "B" };
		int lineNumber = inputArray.length;
		System.out.println(Arrays.toString(inputArray));
		for (j = 1; j < lineNumber - 1; j++) {
			key = inputArray[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(inputArray[i]) < 0) {
					break;
				}
				inputArray[i + 1] = inputArray[i];
				i--;
			}
			inputArray[i + 1] = key;
			System.out.println(Arrays.toString(inputArray));
		}
		System.out.println(Arrays.toString(inputArray));

	}

	/**********************************************************************/
	// Bubblesort for Integer //
	/**
	 * @param num[]
	 *            is the array of input integers
	 */
	public static void bubbleSortInt() {
		int[] num = { 5, 4, 3, 2, 1 };
		sortArray(num);
		printArray1(num);
	}

	/**
	 * @param x
	 *            is the array of input integers
	 */
	public static void sortArray(int[] x) {// go through the array and sort from smallest to highest
		for (int i = 0; i < x.length; i++) {
			for (int j = 1; j < x.length - i; j++) {
				int temp = 0;
				if (x[j - 1] > x[j]) {
					temp = x[j - 1];
					x[j - 1] = x[j];
					x[j] = temp;
				}
			}
		}
	}

	/**
	 * @param x
	 *            is the array of input integers
	 */
	public static void printArray1(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
	}

	/*********************************************************************/
	// Bubblesort for String //
	/**
	 * @param list[]
	 *            is the array of string inputs
	 */
	public static void bubbleSortString() {

		String list[] = { "artichoke", "Apple", "CHERRY", "banana" };

		BubbleSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

	}

	/**
	 * @param array
	 *            is the array of strings
	 */
	public static void BubbleSort(String[] array) {
		String temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/************************************************************************/
	// Binary search for words //
	/**
	 * @param s
	 *            is the string of array
	 * @param key
	 *            is the word to be searched
	 */
	public static void binarySearchWord(String s[], String key) {
		String temp = "";
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		int start = 0;
		int end = s.length - 1;
		for (int i = 0; i < s.length; i++) {
			int mid = (start + end) / 2;
			if (key.compareTo(s[i]) == 0) {
				System.out.println("word found at :" + i);
			} else if (key.compareTo(s[i]) < 0) {
				start = mid + 1;
				mid = (start + end) / 2;

			} else if (key.compareTo(s[i]) > 0) {
				end = mid - 1;
				mid = (start + end) / 2;
			} else
				System.out.println("word not found");
		}
	}

	/*******************************************************************/
	// Bubblesort for list of array//
	/**
	 * @param myList2
	 *            contains list of elements to be sorted
	 */
	public static void bubbleSortList() {
		List<Integer> myList2 = new ArrayList<Integer>();
		int min = 2;
		int max = 30;
		for (int i = 0; i < (int) (Math.random() * (max - min) + min); i++) {
			myList2.add((int) (Math.random() * 100));
		}

		System.out.println("Unsorted list 2");
		for (int element : myList2) {
			System.out.print(element + " ");
		}
		System.out.println("");

		System.out.println("Bubble sorted list 2 (BubbleSort2)");
		bubbleSort2(myList2);
		for (int element : myList2) {
			System.out.print(element + " ");
		}
	}

	/**
	 * @param x
	 *            is list of integers
	 * @param i
	 *            is index of first element
	 * @param j
	 *            is index of second element
	 */
	public static void swap2(List<Integer> x, int i, int j) {
		Integer temp = x.get(i);
		x.set(i, x.get(j));
		x.set(j, temp);
	}

	public static void bubbleSort2(List<Integer> x) {
		int mostRightSwap = x.size() - 1;
		while (mostRightSwap > 0) {
			for (int i = 0; i < x.size() - 1; i++) {
				if (x.get(i) > x.get(i + 1)) {
					swap2(x, i, i + 1);
					mostRightSwap = i;
				}
			}
		}
	}

	/**********************************************************************/
	// MergeSort implementation
	/**
	 * @param ClassOne
	 *            contains array of first string
	 * @param ClassTwo
	 *            contains array of second string
	 * @param names
	 *            contains length of both string arrays
	 */
	public static void mergeSort() {
		String[] ClassOne = { "Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal" };
		String[] ClassTwo = { "Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose",
				"Maria" };
		String[] names = new String[ClassOne.length + ClassTwo.length];

		mergeSort(ClassOne);
		mergeSort(ClassTwo);

		merge(names, ClassOne, ClassTwo);

		mergeSort(names);
		// Arrays.sort(names);

		for (String ClassThree : names) {
			System.out.println(ClassThree);
		}
	}

	/**
	 * @param names
	 *            contains string of array to be sorted
	 */
	public static void mergeSort(String[] names) {
		if (names.length > 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	/**
	 * @param names
	 *            stores array of strings
	 * @param left
	 *            stores array of strings in left half
	 * @param right
	 *            stores array of strings in right half
	 */
	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	/**************************************************************/
	// Insertion sort for list of strings //
	/**
	 * @param list[]
	 *            contains all the elements in list
	 */
	public static void insertionSortList() {
		String Mercury = "Mercury", Venus = "Venus", Earth = "Earth", Mars = "Mars", Jupiter = "Jupiter",
				Saturn = "Saturn", Uranus = "Uranus", Neptune = "Neptune", Pluto = "Pluto";
		String list[] = { Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto };

		System.out.println("Array contents before sorting...");
		System.out.print(list[0]);
		System.out.print(" ");
		System.out.print(list[1]);
		System.out.print(" ");
		System.out.print(list[2]);
		System.out.print(" ");
		System.out.print(list[3]);
		System.out.print(" ");
		System.out.print(list[4]);
		System.out.println("");
		System.out.println("************************************");

		Utility.insertionSort(list);

		System.out.println("************************************");
		System.out.println("Array contents after sorting...");
		System.out.print(list[0]);
		System.out.print(" ");
		System.out.print(list[1]);
		System.out.print(" ");
		System.out.print(list[2]);
		System.out.print(" ");
		System.out.print(list[3]);
		System.out.print(" ");
		System.out.print(list[4]);
	}

	/**
	 * @param list
	 *            contains array of strings
	 */
	public static void insertionSort(String[] list) {
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

	/***********************************************************************/
	// Finding number using binary search //
	/**
	 * @param arr
	 *            is the array of input integers
	 * @param l
	 *            is the start position
	 * @param h
	 *            is the end position
	 * @param x
	 *            is the value to be searched
	 * @return the index of array where the value is found
	 */
	public static int intBinarySearch(int arr[], int l, int h, int x) {
		if (h >= l) {
			int mid = l + (h - l) / 2;
			if (arr[mid] == x)
				return mid;
			else if (x < arr[mid])
				return intBinarySearch(arr, l, mid - 1, x);
			else
				return intBinarySearch(arr, mid + 1, h, x);
		}
		return -1;
	}

	/**
	 * @param arr
	 *            is the array of integers
	 * @param l
	 *            is the start value
	 * @param h
	 *            is the end value
	 * @return the index of array where the value is found
	 */
	public static int findNumber(int[] arr, int l, int h) {
		while (h > l) {
			int mid = (l + h) / 2;
			System.out.println("is your no. greater than " + (mid + 1));
			System.out.println("press 1 if yes,press 0 if no else press anythig");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				return findNumber(arr, mid + 1, h);
			case 0:
				return findNumber(arr, l, mid - 1);
			default:
				return mid + 1;
			}
		}
		return -1;
	}

	/****************************************************************/
	// DayOfWeek Implementation
	/**
	 * @param m
	 *            is the integer input month value
	 * @param d
	 *            is the integer input day value
	 * @param year
	 *            is the integer input year value
	 */

	public static void dayOfWeek(int m, int d, int year) {

		if (m < 1 || m > 12)
			System.out.println("Invalid month");
		if (d < 1 || d > 31)
			System.out.println("Invalid day");
		if (year < -10000 || year > 10000)
			System.out.println("Invalid year");

		int y0 = year - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		System.out.println(d0);
		if (d0 == 0)
			System.out.println("Sunday");
		else if (d0 == 1)
			System.out.println("Monday");
		else if (d0 == 2)
			System.out.println("Tuesday");
		else if (d0 == 3)
			System.out.println("wednesday");
		else if (d0 == 4)
			System.out.println("Thursday");
		else if (d0 == 5)
			System.out.println("Friday");
		else
			System.out.println("Saturday");

	}

	/************************************************************/
	// Temperature Conversion implementation //
	/**
	 * @param CTF
	 *            is the temperature from celcius to fahrenheit
	 * @param FTC
	 *            is the temperature from fahrenheit to celcius
	 */

	public static void temperatureConversion(double CTF, double FTC) {
		System.out.println("Celsius to Fahrenheit" + CTF);
		System.out.println("Fahrenheit to Celsius" + FTC);
	}

	/**********************************************************************/
	// Monthly Payment Implementation //
	/**
	 * @param principle
	 *            is the double input principle amount
	 * @param year
	 *            is the double input year
	 * @param rate
	 *            is the double input rate of interest
	 */

	public static void monthlyPayment(double principle, double year, double rate) {
		double P = principle;
		double Y = year;
		double R = rate;
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment;
		System.out.println("enter principle");
		System.out.println("enter year");
		System.out.println("enter rate of interest");
		payment = ((P * r) / (1 - Math.pow((1 + r), (-n))));
		System.out.println("Monthly payment is:" + payment);

	}

	/******************************************************************/
	// A utility class to implement vending machine //
	/**
	 * @param money
	 *            is the customer change money
	 * @param notes
	 *            is the no. of notes customer will receive
	 */

	static int i = 0;
	static int total = 0;
	static int[] notes = { 1000, 500, 100, 50, 5, 2, 1 };
	static int money;

	public static int vendingMachine(int money, int[] notes) {
		int rem;
		if (money == 0)
			return -1;
		else {
			if (money >= notes[i]) {
				int calNotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total += calNotes;
				System.out.println(notes[i] + "Notes-->" + calNotes);
				System.out.println("is total no. of notes " + total);
			}
			i++;
			return vendingMachine(money, notes);
		}

	}

	/*********************************************************************/
	// Newtons method for sqrt //
	/**
	 * @param t
	 *            is the sqrt of a number
	 * @param c
	 *            is the input no.
	 */
	public static void sqrt(double c) {
		double t;
		t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t)
			t = ((c / t) + t) / 2;
		System.out.println("Sqrt of given no. is" + t);

	}

	/***********************************************************************/
	// binaryDigit //
	/**
	 * @param n
	 *            is the input no. whose binary digit is to be calculated
	 */
	public static void binaryDigit(int digit) {
		int count = 0;
		String binaryDigit = "";
		while (digit > 0) {
			count++;
			binaryDigit += digit % 2;
			digit /= 2;
		}
		String reverse = "";
		int len = binaryDigit.length();
		for (int j = len - 1; j >= 0; j--)
			reverse = reverse + binaryDigit.charAt(j);
		System.out.println("Binary representation of " + digit + " is " + reverse);
		String out1 = "";
		for (int i = 0; i < 8 - count; i++) {
			out1 += 0;
		}
		out1 = out1 + reverse;
		System.out.println("Binary representation of " + digit + " is " + out1);
	}

	/*******************************************************************/
	// Implementation of nibbles to digits
	/**
	 * @param digit
	 *            is the input integer no.
	 */
	public static void binaryNibble(int digit) {
		int count = 0;
		String binaryDigit = "";
		String out1 = "";
		int temp = digit;
		while (temp > 0) {
			count++;
			binaryDigit += temp % 2;
			temp /= 2;
		}
		String reverse = "";
		int len = binaryDigit.length();
		for (int j = len - 1; j >= 0; j--) {
			reverse = reverse + binaryDigit.charAt(j);
		}
		for (int i = 0; i < 8 - count; i++) {
			out1 += 0;
		}
		out1 = out1 + reverse;
		System.out.println("Binary representation of " + digit + " is " + out1);
		System.out.println("No. of digits is " + (count + 1));

		String nib1 = "";
		String nib2 = "";

		char[] digit1 = out1.toCharArray();
		for (int i = 0; i < 4; i++)
			nib1 += digit1[i];
		System.out.println("nib1 " + nib1);

		for (int j = 4; j < 8; j++)
			nib2 += digit1[j];

		System.out.println("nib2 " + nib2);

		// Swapping the nibbles
		nib1 = nib1 + nib2;
		nib2 = nib1.substring(0, nib1.length() - nib2.length());
		System.out.println("nib2 final " + nib2);
		nib1 = nib1.substring(nib2.length());
		System.out.println("nib1 final " + nib1);
		String nib3 = "";
		nib3 = nib1 + nib2;
		System.out.println("nib3 is" + nib3);
		int bin = Integer.parseInt(nib3);
		int decimal = 0;
		int power = 0;
		while (bin > 0) {
			int temp1 = bin % 10;
			decimal += temp1 * Math.pow(2, power);
			bin = bin / 10;
			power++;
		}
		System.out.println("decimal representation of no. is" + decimal);
		int n1 = decimal;
		if (((~n1) & 1) != 1)
			System.out.println("No. is power of 2");
		else
			System.out.println("no. is not power of 2");
	}

	/*****************************************************************/
	// GenericFunctionsfor sorting,searching techniques//
	// Binary Search //
	public static <T extends Comparable<T>> int genBinarySearch(T[] arr, int l, int h, T x) {
		if (h >= l) {
			int mid = l + (h - l) / 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid].compareTo(x) > 0)
				return genBinarySearch(arr, l, mid - 1, x);
			else
				return genBinarySearch(arr, mid + 1, h, x);
		}
		return -1;
	}

	// LinearSearch //
	public static <T extends Comparable<T>> int genlinearSearch(T[] arr, T x, int l, int h) {
		for (int i = l; i <= h; i++) {
			if (arr[i].compareTo(x) == 0)
				return i;
		}
		return -1;
	}

	// SwapFunction//
	public static <T> void swap(T[] arr, int l, int h) {
		T temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;
	}

	// Partition Function//
	public static <T extends Comparable<T>> int partition(T[] arr, int l, int h, int pivot) {
		T val = arr[pivot];
		while (l < h) {
			while (arr[l].compareTo(val) < 0)
				l++;
			while (arr[h].compareTo(val) > 0)
				h--;
		}
		return l;
	}

	// InsertionSort //
	// In-place Insertion Sort - O(n^2)
	public static <T extends Comparable<T>> void genInsertionSort(T[] arr1) {
		for (int i = 1; i < arr1.length; i++) {
			T n = arr1[i];
			int pos = i;
			while (pos > 0 && arr1[pos - 1].compareTo(n) > 0) {
				arr1[pos] = arr1[--pos];
			}
			arr1[pos] = n;
		}
	}

	// BubbleSort //
	public static <T extends Comparable<T>> void genbubbleSortList() {
		List<Integer> myList2 = new ArrayList<Integer>();
		int min = 2;
		int max = 30;
		for (int i = 0; i < (int) (Math.random() * (max - min) + min); i++) {
			myList2.add((int) (Math.random() * 100));
		}

		System.out.println("Unsorted list 2");
		for (int element : myList2) {
			System.out.print(element + " ");
		}
		System.out.println("");

		System.out.println("Bubble sorted list 2 (BubbleSort2)");
		bubbleSort2(myList2);
		for (int element : myList2) {
			System.out.print(element + " ");
		}
	}

	public static void genSwap(List<Integer> x, int i, int j) {
		Integer temp = x.get(i);
		x.set(i, x.get(j));
		x.set(j, temp);
	}

	public static void bubbleSort21(List<Integer> x) {
		int mostRightSwap = x.size() - 1;
		while (mostRightSwap > 0) {
			for (int i = 0; i < x.size() - 1; i++) {
				if (x.get(i) > x.get(i + 1)) {
					swap2(x, i, i + 1);
					mostRightSwap = i;
				}
			}
		}
	}

	// MergeSort //
	public static <T extends Comparable<T>> void genMergeSort() {
		String[] ClassOne = { "Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal" };
		String[] ClassTwo = { "Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose",
				"Maria" };
		String[] names = new String[ClassOne.length + ClassTwo.length];

		genmergeSort(ClassOne);
		genmergeSort(ClassTwo);

		genmerge(names, ClassOne, ClassTwo);

		genmergeSort(names);
		// Arrays.sort(names);

		for (String ClassThree : names) {
			System.out.println(ClassThree);
		}
	}

	public static <T extends Comparable<T>> void genmergeSort(T[] names) {
		if (names.length > 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = (String) names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = (String) names[i + names.length / 2];
			}

			genmergeSort(left);
			genmergeSort(right);
			genmerge(names, left, right);
		}
	}

	public static <T extends Comparable<T>> void genmerge(T[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = (T) left[a];
				a++;
			} else {
				names[i] = (T) right[b];
				b++;
			}
		}
	}

	/****************************************************************/
	// bubbleSort for an array
	public static <T extends Comparable<T>> T[] bubbleSort(T[] integers) {
		int n = integers.length;
		T temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (integers[j - 1].compareTo(integers[j]) > 0) {
					// swap elements
					temp = (T) integers[j - 1];
					integers[j - 1] = integers[j];
					integers[j] = temp;
				}

			}
		}
		return integers;
	}

	/***************************************************************************/
	// Calender.java implementation //
	// Date validator functions //
	/**
	 * @param d
	 *            input date
	 * @param m
	 *            input month
	 * @param y
	 *            input year
	 * @return
	 */
	public static boolean dateValidator(int d, int m, int y) {

		boolean b = true;
		if (((m == 4 || m == 6 || m == 9 || m == 11) && (d > 30)) || (d > 31)
				|| (m == 2 && y % 100 == 0 && y % 400 != 0 && d > 28) || (m == 2 && y % 400 == 0 && d > 29)
				|| (m == 2 && y % 100 != 0 && y % 4 != 0 && d > 28)
				|| (m == 2 && y % 100 != 0 && y % 4 == 0 && d > 29)) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	public static int dayStart(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		return ((d + x + (31 * m0) / 12) % 7);

	}

	/*********************************************************************/
	// Calender for particular month implementation //
	private static int numDays = 0;
	private static int h = 0;
/**
 * @param y input year
 * @return true if year is leap year else false
 */
	public static boolean leap(int y) {
		if (((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
/**
 * @param y input year
 */
	public static void firstDayOfYear(int y) {
		int month = 13;
		y--;
		h = (1 + (int) (((month + 1) * 26) / 10.0) + y + (int) (y / 4.0) + 6 * (int) (y / 100.0)
				+ (int) (y / 400.0)) % 7;
		String dayName = "";
		switch (h) {
		case 0:
			dayName = "Saturday";
			break;
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		default:
			dayName = "Friday";
			break;
		}
		System.out.println("The first day of the year is " + dayName);
	}
	/**
	 * @param m input month
	 * @param y input year
	 */
	public static void firstDayOfMonth(int m, int y) {
		if (m == 1 || m == 2) {
			m += 12;
			y--;
		}
		h = (1 + (int) (((m + 1) * 26) / 10.0) + y + (int) (y / 4.0) + 6 * (int) (y / 100.0)
				+ (int) (y / 400.0)) % 7;
		String dayName = "";
		switch (h) {
		case 0:
			dayName = "Saturday";
			break;
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		default:
			dayName = "Friday";
			break;
		}
		System.out.println("The first day of the month is " + dayName);
	}
/**
 * @param m input month
 * @param y input year
 */
	public static void numDaysInMonth(int m, int y) {
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (m == 2 && leap(y))
			days[m] = 29;
		numDays = days[m];
		System.out.println("The number of days in the month is " + numDays);
	}
/**
 * @param m input month
 * @param y input year
 */
	public static void printCal(int m, int y) {
		String[] monthNames = { "", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };

		System.out.println("    " + monthNames[m] + " " + y);
		System.out.println("Su Mo Tu We Th Fr Sa");
		for (int i = 0; i < h - 1; i++)
			System.out.print("   ");
		for (int i = 1; i <= numDays; i++) {
			System.out.printf("%2d ", i);
			if (((i + h - 1) % 7 == 0) || (i == numDays))
				System.out.println();
		}
	}

	/************************************************************************/
	// To check prime number//
	/**
	 * @param n
	 *            number input
	 * @return true if prime,false if not prime
	 */
	public static boolean findPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**************************************************************************/
	// To check if the no. is Anagram //
	/**
	 * @param s1
	 *            string input
	 * @param s2
	 *            string input
	 * @return
	 */
	public static boolean isAnagram(String s1, String s2) {
		s1 = removeSpace(s1);
		s2 = removeSpace(s2);
		if (s1.length() != s2.length())
			return false;
		s1 = toLowerCase(s1);
		s2 = toLowerCase(s2);
		boolean b = check(s1, s2);
		return b;
	}

	/**
	 * @param s1
	 *            string input
	 * @param s2
	 *            string input
	 * @return
	 */
	private static boolean check(String s1, String s2) {
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		ch1 = sort(ch1);
		ch2 = sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i])
				return false;
		}
		return true;
	}

	/**
	 * @param ch
	 *            input char array
	 * @return char array
	 */
	private static char[] sort(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}

	/**
	 * @param s1
	 *            string
	 * @return
	 */
	private static String toLowerCase(String s1) {
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 91)
				ch[i] = (char) (ch[i] + 32);
		}
		s1 = new String(ch);
		return s1;
	}

	/**
	 * @param s1
	 *            string
	 * @return
	 */
	private static String removeSpace(String s1) {
		char ch[] = s1.toCharArray();
		s1 = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				s1 = s1 + ch[i];
		}
		return s1;
	}
	/***********************************************************************/
}
