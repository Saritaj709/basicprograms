package com.bridgelabz.utility;

import com.bridgelabz.functionprogs.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Utility {
/******************************************************************************/
	// Count of triplets implementation or Sum of three integer adds to zero implementation  //
	
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
	 //  PermutationOfString implementation//
	
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
	
	public static int[][] arrayInt(int rows, int cols) {
		int a[][] = new int[rows][cols];
		sc = new Scanner(System.in);
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
		sc2 = new Scanner(System.in);
		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc2.nextDouble();
			}
		}
		return b;
	}

	public static String[][] arrayBoolean(int rows, int cols) {
		String c[][] = new String[rows][cols];
		sc3 = new Scanner(System.in);
		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = sc3.next();
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

	static String[] board;
	static String turn;
	private static Scanner sc;
	private static Scanner sc2;
	private static Scanner sc3;
	private static Object key;

	public static void stopWatch(long start, long end) {
		start = System.nanoTime();
		System.out.println("calculating time from " + start + "nano secs" + end + "micro sec");
	   end = System.nanoTime();
		long total_time = end - start;
		System.out.println("Time measured is:  " + total_time + "nano secs");

	}
	
	 // Timer functions
	public static long startTimer()   //Start
	{
		System.out.println("Timer started....");
	    long startTime=System.nanoTime();
	    return startTime;
	}
	public static long endTimer()       //end
	{
		System.out.println("Timer ended......");
		long endTime=System.nanoTime();
		return endTime;
	}

	/************************************************************************/
	// Quadratic_Equation implementation //
	public static double quadratic() {
		Scanner sc12 = new Scanner(System.in);
		double a = sc12.nextDouble();
		double b = sc12.nextDouble();
		double c = sc12.nextDouble();
		double delta, Root1, Root2;
		delta = b * b - 4 * a * c;
		if(delta<0)
		{
			System.out.println("Roots are imaginary");
		}
		Root1 = (-b + sqrt(delta)) / (2 * a);
		Root2 = (-b - sqrt(delta)) / (2 * a);
		System.out.println("Root1:" + Root1);
		System.out.println("Root2:" + Root2);
		return delta;
	}
	 public static final double sqrt(double x) 
	{
		double y = x * x;
		return y;
	} 
	 /******************************************************************/
       // Coupon Number implementation//	 
	 public static int getCoupon(int n)
	 {
	 return (int)(Math.random()*n);
	 }
	 public static int collect(int n)
	 {
	 boolean[] isCollected=new boolean[n];
	 int count=0;
	 int distinct=0;
	 while(distinct<n)
	 {
	 int value=getCoupon(n);
	 count++;
	 if(!isCollected[value])
	 {
	 distinct++;
	 isCollected[value]=true;
	 }
	 }
	 return count;
	 } 
	/***********************************************************************/
	 
	 
	 public static void display()
	 {
	 String s1;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter username");
	 s1=sc.nextLine();
	 char input[]=s1.toCharArray();
	 if(input.length<3)
	 System.out.println("enter name with more chars");
	 else
	 System.out.println("Hello " + s1 +",How are you?");

}
	  /*********************************************************************/
	 
	 // FlipCoin implementation    //
	 
	 public static void flipCoin()
	 {
		 int loopCount=1;
		 int numFlips;
		 int head=0;
		 Scanner sc4 = new Scanner(System.in);
		 System.out.println("enter value");
		 numFlips=sc4.nextInt();
		 while(loopCount<=numFlips)
		 {
			 double result= Math.random();
			 if(result<=.5)
				 head++;loopCount++;
		 }
		 double percentHead=(head*100)/numFlips;
		 double percentTails=((numFlips-head)*100)/numFlips;
		 System.out.println("Head percentage="+percentHead+"%");
		 System.out.println("Tail percentage="+percentTails+"%");
	 }
/****************************************************************************/
	   // LeapYear implementation //
	 
	 public static void leapYear()
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter any year:");
	 int year=sc.nextInt();
	 boolean flag=false;
	 if(year%400==0)
	 flag=true;
	 else if(year%100==0)
	 flag=false;
	 else if(year%4==0)
	 flag=true;
	 else
	 flag=false;
	 if(flag)
	 System.out.println("Year " + year + " is a leap year");
	 else
	 System.out.println("Year " + year + " is not a leap year");
	 }
/****************************************************************************/
	 // Power2 implementation  //
	public static void power2(int N)
	{
	 if(N<0 || N>30)
	 System.out.print("invalid");
	 else
	 {
	 for(int i=0;i<=N;i++)
	 {
	 System.out.println("2^ "+i + "=" + Math.pow(2,+i)); 
	 }
	 
}
	 }
	/*************************************************************************/
	
	   // Harmonic Number implementation //
	
	public static void harmonicNumber()
	{
		double N;double sum=0.0;
		System.out.println("enter the value of N");
		Scanner sc5 = new Scanner(System.in);
		N=sc5.nextInt();
		System.out.println("N value :" +N);
		if(N==0)
		System.out.println("invalid");
		for(double i=1;i<=N;i++)
		sum=sum+1/i;
		double sum2=1/N;
		System.out.println("Sum of values "+sum);
		System.out.println("Nth harmonic value "+sum2);
	}
	/*************************************************************************/
	
	// Prime Factors    implementation  //
	
	public static void primeFactors()
	{
	int n;
	System.out.println("enter the no.");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n%2==0)
	{
	System.out.println(2 + " ");
	n /=2;
	}
	for(int i=3;i*i<=n;i+=2)
	{
	while(n%i==0)
	{
	System.out.println(i);
	n /=i;
	}
	
    }
	
	if(n>2)
	{
	System.out.println(n);
	}
}
	
	/************************************************************************/
	 
	// Gambler program implementation //
	
	public static void gambler()
	{
		int $Stake,$Goal,noOfTimes;
		Scanner sc6 = new Scanner(System.in);
		System.out.println("enter $stake");
		$Stake=sc6.nextInt();
		System.out.println("enter $goal");
		$Goal=sc6.nextInt();
		System.out.println("enter noOfTimes");
		noOfTimes=sc6.nextInt();
		 double bets=0,noOfWins=0,noOfLoose=0;
	    if(noOfTimes>0)
	    {
		while($Stake>0 && $Stake!=$Goal)
		{
		if(Math.random()>0.5)
		{bets++;
		noOfWins++;
		$Stake=$Stake+1;
		System.out.println("won");
		}
		else
		{
			noOfLoose++;
			$Stake=$Stake-1;
			System.out.println("loose");
		}
		}
		System.out.println();
		System.out.println(noOfWins + " wins " +noOfTimes + "number of times");
		System.out.println(noOfLoose + "loose" + noOfTimes + "number of times");
		System.out.println("Percentage of game won= " +(noOfWins*100)/(noOfWins+noOfLoose));
		System.out.println("Percentage of game loosed=" +(noOfLoose*100)/(noOfWins+noOfLoose));
		System.out.println("avg. no. of bets= " +bets/noOfTimes);
		}
	}
/***************************************************************************/
	// Euclidean distance implementation //  
	
	public static  void distance1(double x,double y)
	  {
		  double distance=Math.pow(x,2)+Math.pow(y,2);
		  System.out.println(Math.sqrt(distance));
	  }
	  /********************************************************************/
	 // Windchill implementation //  
	
	public static void windChill(double t,double v)
	{
		if(t>50 || v<3 || v>120)
		{
		System.out.println("invalid ");
		}
		else
		{
		double w=35.74+0.6215*t+(0.4275*t - 35.75)*Math.pow(v,0.16);
		System.out.println("WindChill " +w);
	}
}
	/***********************************************************************/
	// TicTacToeCross game implementation //
	
		public static final int X = 1, O = -1;
		public static final int EMPTY = 0;
		
		public int player = X;
		public int [][]board1 = new int[3][3];
		public boolean isEmpty = false;
		
		public void putSign(int x, int y)
		{
			if(x<0 || x>2 || y<0 || y>2)
			{
				System.out.println("Invalid board position");
				return;
			}
			if(board1[x][y] != EMPTY)
			{
				System.out.println("Board position occupied");
				return;
			}
			board1[x][y] = player;
			player = -player;
		}
		
		public boolean isWin(int player)
		{
			return ((board1[0][0] + board1[0][1] + board1[0][2] == player*3) ||
					(board1[1][0] + board1[1][1] + board1[1][2] == player*3) ||
					(board1[2][0] + board1[2][1] + board1[2][2] == player*3) ||
					(board1[0][0] + board1[1][0] + board1[2][0] == player*3) ||
					(board1[0][1] + board1[1][1] + board1[2][1] == player*3) ||
					(board1[0][2] + board1[1][2] + board1[2][2] == player*3) ||
					(board1[0][0] + board1[1][1] + board1[2][2] == player*3) ||
					(board1[2][0] + board1[1][1] + board1[0][2] == player*3));
		}
		
		public void displayWinner()
		{
			if(isWin(X))
			{
				System.out.println("\n X wins...!!");
				isEmpty=false;
			}
			else if(isWin(O))
			{
				System.out.println("\n O wins...!!");
				isEmpty=false;
			}
			else
			{
				if(!isEmpty)
				{
					System.out.println("its a tie");
				}
				
			}
		}
		
		public String toString()
		{
			StringBuilder s = new StringBuilder();
			isEmpty = false;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					switch(board1[i][j])
					{
					case X: 
						s.append(" X ");
						break;
					case O: 
						s.append(" O ");
						break;
					case EMPTY: 
						s.append("   ");
						isEmpty=true;
						break;
					}
					if(j<2)
					{
						s.append("|");
					}
					
				}
				if(i<2)
				{
					s.append("\n-----------\n");
				}
			}
			return s.toString();
		}
	
		/**************************************************************/
		//      Algorithm Programs
/**************************************************************************/
		// First Program
	/******************************************************************/
		// Two detect of two strings are Anagram (having same characters in both) //
		
		public static void anagramDetection()
		{
			String s1 = "abcd";
		    String s2 = "dcba";
		    boolean isAnagram = false;
		    if (s1.length() == s2.length()) {
		        char[] s1AsChar = s1.toCharArray();
		        char[] s2AsChar = s2.toCharArray();
		        Arrays.sort(s1AsChar);
		        Arrays.sort(s2AsChar);
		        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
		   if(isAnagram==true)
		    System.out.println("Strings are anagram");
		else
		System.out.println("Strings are not anagram");
		}
		
		}
 /************************************************************************/
		 // To find Prime numbers from 0 to 1000
		
		public static void primeNumbers()
		{
			int i;
			for(i=0;i<=1000;i++)
			{
				for(int j=2;j<i;j++)
				{

			if(i%j==0)	
				{//System.out.println("Not a prime no.");
			break;
				}
				}
				System.out.println("prime no.s are:" +i);
			}
		}
		
/**************************************************************************/	
         // Prime numbers that are anagram and palindrome
		
		public static boolean oneDigit(int num)
		{
			return(num>=0 && num<10);
		}
		public static boolean isPalUtil(int num,int dupNum)
		{
			if(oneDigit(num))
				return(num==(dupNum)%10);
			if(!isPalUtil(num/10,dupNum))
				return false;
			dupNum/=10;
			return(num%10==(dupNum%10));
		}
		public static boolean isPal(int num)
		{
			if(num<0)
				num=-num;
			int dupNum=num;
			return isPalUtil(num,dupNum);
		}
		public static void printPalPrime(int n)
		{
			boolean prime[]=new boolean[n+1];
			Arrays.fill(prime, true);
			for(int p=2;p*p<=n;p++)
			{
				if(prime[p])
					for(int i=p*2;i<=n;i+=p)
					{
						prime[i]=false;
					}
			}
		
		for(int p=2;p<=n;p++)
		{
			if(prime[p] && isPal(p))
			{
				System.out.print(p+" ");
			}
		}
}
		
/**********************************************************************/
		
		//Sorting Techniques(binary search,insertion sort,bubble sort)

		public static void BinarySearchMethodInt()
		{
			 int arr1[] = {2,3,4,10,40};
		        int n = arr1.length;
		        int search = 10;
		        int result =binarySearch(arr1,0,n-1,search);
		        if (result == -1)
		            System.out.println("Element not present");
		        else
		            System.out.println("Element found at index " + 
		                                                 result);
		}
	        // Returns index of x if it is present in arr[start..
			    // end], else return -1
			  static  int binarySearch(int arr[], int start, int end, int pos)
			    {
			        if (end>=start)
			        {
			            int mid = start + (end - start)/2;
			 
			            // If the element is present at the 
			            // middle itself
			            if (arr[mid] == pos)
			               return mid;
			 
			            // If element is smaller than mid, then 
			            // it can only be present in left subarray
			            if (arr[mid] > pos)
			               return binarySearch(arr, start, mid-1, pos);
			 
			            // Else the element can only be present
			            // in right subarray
			            return binarySearch(arr, mid+1, end, pos);
			        }
			 
			        // We reach here when element is not present
			        //  in array
			        return -1;
			    }
			  
/**************************************************************************/
        /*  public static void binarySearchString()
          {
        	  String[] names = new String[] {"peach", "apple", "fig", "mango", "orange", "blueberry"};
        	  
        	    System.out.println();
        	    System.out.println("String test array contains...");
        	 
        	    for (int j = 0; j < names.length; j++) {
        	    for (int i = j + 1; i < names.length; i++) {
        	        if (names[i].compareTo(names[j]) < 0) {
        	          String t = names[j];
        	          names[j] = names[i];
        	          names[i] = t;
        	        }
        	      }
        	      System.out.print(names[j] + " ");
        	    }
        	 
        	    int results;
        	    for (int key = -4; key < 6; key++)
        	    {
        	        results = searchString(names, key);
        	        if (results >= 0)
        	            System.out.println(key + " is at index " + results);
        	        else
        	            System.out.println(key + " is not in the array.");
        	 
        	  }
          }
        	 
        	    public static int search(int[]a, int first, int last, int key)
        	    {
        	        int result = 0;
        	 
        	        if (first > last)
        	            result = -1;
        	        else
        	        {
        	            int mid = (first + last)/2;
        	 
        	            if (key == a [mid])
        	                result = mid;
        	            else if (key < a[mid])
        	                result = search(a, first, mid - 1, key);
        	            else if (key > a[mid])
        	                result = search(a, mid + 1, last, key);
        	        }
        	        return result;
        	    }
        	    public static int searchString(String[] names, String key) {
        	    int first = 0;
        	    int last  = names.length;
        	 
        	    while (first < last) {
        	        int mid = (first + last) / 2;
        	        if (key.compareTo(names[mid]) < 0) {
        	            last = mid;
        	        } else if (key.compareTo(names[mid]) > 0) {
        	            first = mid + 1;
        	        } else {
        	            return mid;
        	        }
        	    }
        	    return -(first + 1);
        	}
        	 
        	*/
		 public static void insertionSortInt()
		 {
			 int arr[] = {12, 11, 13, 5, 6};

			    sort(arr);
			           
			          printArray(arr);
		 }
		     /*Function to sort array using insertion sort*/
			   public static void sort(int arr[])
			      {
			          int n = arr.length;
			          for (int i=1; i<n; ++i)
			          {
			              int key = arr[i];
			              int j = i-1;
			   
			              /* Move elements of arr[0..i-1], that are
			                 greater than key, to one position ahead
			                 of their current position */
			              while (j>=0 && arr[j] > key)
			              {
			                  arr[j+1] = arr[j];
			                  j = j-1;
			              }
			              arr[j+1] = key;
			          }
			      }
			   
			      /* A utility function to print array of size n*/
			     public static void printArray(int arr[])
			      {
			          int n = arr.length;
			          for (int i=0; i<n; ++i)
			              System.out.print(arr[i] + " ");
			   
			          System.out.println();
			      }
			   
			     /********************************************************/
			     //Insertionsort for String     //

			    public static void insertionsortString()
			    {
			         int lineNumber = 5;
			         int i,j;
			         String key;
			         String[] inputArray = {"E","D","C","B","A","B"};
			         System.out.println(Arrays.toString(inputArray));
			         for (j = 1; j < lineNumber; j++) {
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
			    
			    
			    /****************************************************/
			    // Bubblesort for Integer //
			    public static void bubbleSortInt()
			    {
			    	int[] num = {5,4,3,2,1};
			        sortArray(num);
			        printArray1(num);  
			    }
			    public static void sortArray(int[] x) {//go through the array and sort from smallest to highest
			        for(int i=0; i<x.length; i++) {
			        	for(int j=1;j<x.length-i;j++)
			        	{
			           int temp=0;
			           if(x[j-1] > x[j]) {
			              temp = x[j-1];
			              x[j-1] = x[j];
			              x[j] = temp;
			           }
			        }
			     }
			    }

			     public static void printArray1(int[] x) {
			        for(int i=0; i<x.length; i++)
			          System.out.print(x[i] + " ");
			     }
	/*************************************************************/
			     //Bubblesort for String //
			    
			     public static void bubbleSortString()
			     {
			    		        //Declare and Initialize Array

			    		        String list[]={"artichoke" , "Apple" , "CHERRY" , "banana"};

			    		        BubbleSort(list);
			    		        //Begin For loop

			    		        for(int i=0; i<list.length; i++)

			    		        {

			    		            System.out.println(list[i]);

			    		        }

			    		    }// End of Main

			    		     

			    		    public static void BubbleSort(String[] array) {

			    		        String temp;

			    		        // Begin For loop

			    		        for(int i=0; i<array.length; i++) {

			    		            //Open For loop

			    		            for(int j=0; j<array.length-1-i; j++) {

			    		                //Open If Statement Compare and sort strings

			    		            if(array[j].compareTo(array[j+1])>0) {

			    		                temp = array[j];

			    		                array[j] = array[j+1];

			    		                array[j+1] = temp;

			    		            }//End of If Statement

			    		        }//End of For Loop

			    		        }//End of For Loop

			    		    }
 /*********************************************************************/
			    		    // Binary search for words //
			    		    
			    		    public static void binarySearchWord(String s[],String key)
			    		    {
			    		    	String temp="";
			    		    	for(int i=0;i<s.length-1;i++)
			    		    	{
			    		    		for(int j=i+1;j<s.length;j++)
			    		    		{
			    		    			if(s[i].equals(s[j]))
			    		    			{
			    		    				temp=s[i];
			    		    				s[i]=s[j];
			    		    				s[j]=temp;
			    		    			}
			    		    		}
			    		    	}
			    		    	int start=0;
			    		    	int end=s.length-1;
			    		    	for(int i=0;i<s.length;i++)
			    		    	{
			    		    	int mid=(start+end)/2;
			    		    	if(key.compareTo(s[i])==0)
			    		    	{
			    		    		System.out.println("word found at :" +i);
			    		    	}
			    		    	else if(key.compareTo(s[i])<0)
			    		    	{
			    		    		start=mid+1;
			    		    		mid=(start+end)/2;
			    		    		
			    		    			}
			    		    	else if(key.compareTo(s[i])>0)
			    		    	{
			    		    	end=mid-1;
			    		    	mid=(start+end)/2;
			    		    	}
			    		    	else
			    		    		System.out.println("word not found");
			    		    	}
			    		    }
	/*******************************************************************/
			   //Bubblesort for list of array//
			    		    
public static void bubbleSortList()
    {
        List<Integer> myList2 = new ArrayList<Integer>();
        int min = 2;
        int max = 30;
        for (int i=0; i<(int)(Math.random() * ( max - min) + min); i++)
        {
            myList2.add((int)(Math.random() * 100));
        }

        System.out.println("Unsorted list 2");
        for (int element: myList2)
        {
            System.out.print(element + " ");
        }
        System.out.println("");

        System.out.println("Bubble sorted list 2 (BubbleSort2)");
        bubbleSort2(myList2);
        for(int element: myList2)
        {
            System.out.print(element + " ");
        }
    }

    public static void swap2(List<Integer> x, int i, int j)
    {
        Integer temp = x.get(i);
        x.set(i, x.get(j));
        x.set(j, temp);
    }

    public static void bubbleSort2(List<Integer> x)
    {
        int mostRightSwap = x.size() - 1;
        while (mostRightSwap > 0)
        {
            for (int i=0; i<x.size()-1; i++)
            {
                if (x.get(i) > x.get(i + 1))
                {
                    swap2(x, i, i + 1);
                    mostRightSwap = i;
                }
            }
        }
    }
    
/**********************************************************************/
    // MergeSort implementation

    public static void mergeSort()
    {
            String[] ClassOne = { "Kring", "Panda", "Soliel", "Darryl", "Chan", "Matang", "Jollibee.", "Inasal" };
            String[] ClassTwo = { "Minnie", "Kitty", "Madonna", "Miley", "Zoom-zoom", "Cristine", "Bubbles", "Ara", "Rose", "Maria" };
            String[] names = new String[ClassOne.length + ClassTwo.length];

            mergeSort(ClassOne);
            mergeSort(ClassTwo);

            merge(names, ClassOne, ClassTwo);

            mergeSort(names);
            //Arrays.sort(names);

            for (String ClassThree : names) {
                System.out.println(ClassThree);
            }
        }

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
        //  Insertion sort for list of strings  //
        
        public static void insertionSortList()
        {
                String Mercury="Mercury", Venus="Venus", Earth="Earth", Mars="Mars", Jupiter="Jupiter", Saturn="Saturn", Uranus="Uranus", Neptune="Neptune", Pluto="Pluto" ;
                String list [] = {Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto};

                System.out.println ("Array contents before sorting...");
                System.out.print (list [0]);
                System.out.print (" ");
                System.out.print (list [1]);
                System.out.print (" ");
                System.out.print (list [2]);
                System.out.print (" ");
                System.out.print (list [3]);
                System.out.print (" ");
                System.out.print (list [4]);
                System.out.println ("");
                System.out.println ("************************************");
                System.out.println ("PLEASE. NOT THE ASS.");

                Utility insertionSortList;
				Utility.insertSort (list);

                System.out.println ("************************************");
                System.out.println ("Array contents after sorting...");
                System.out.print (list [0]);
                System.out.print (" ");
                System.out.print (list [1]);
                System.out.print (" ");
                System.out.print (list [2]);
                System.out.print (" ");
                System.out.print (list [3]);
                System.out.print (" ");
                System.out.print (list [4]);





                // Place your program here.  'c' is the output console
            }

            public static void insertSort (String [] list)
            {
                for (int top = 1 ; top < list.length ; top++)
                {
                    String item = list [top];
                    int i = top;
                    while (i > 0 && item.compareTo(list [i - 1]) < 0)
                    {
                        list [i] = list [i - 1];
                        i--;
                    }
                    list [i] = item;
                    System.out.print (list [0]);
                    System.out.print (" ");
                    System.out.print (list [1]);
                    System.out.print (" ");
                    System.out.print (list [2]);
                    System.out.print (" ");
                    System.out.print (list [3]);
                    System.out.print (" ");
                    System.out.print (list [4]);
                    System.out.println ();
                }
            }
        // Insertion_Sort_Example class
    

 /***********************************************************************/
       // Finding number using binary search //
 /*public static void binarySearch(int key,int low,int high,int arr[])
 {
	 int N = 0,mid;
	 boolean flag=true;
	 System.out.println("enter array");
	 for(int i=0;i<10;i++)
	 {
	 arr[i] = sc.nextInt();
	 }
	 low=0;high=N-1;
		 mid=(low+high)/2;
	 while(low<=high)
	 { 
		 if(key<high && key>low)
		 {	flag=true;
		 else flag=false;
		 }
		if(arr[mid]==key) 
		{
			System.out.println(key +"element found at pos"+(mid+1));
		break;
		}
			else if(arr[mid]<key)
			low=mid+1;
			else
		 	high=mid-1;
	 
		System.out.println("low value" +low);
		System.out.println("high value"+high);
		if(low>high)
	System.out.println("No. not found");	
		Utility.binarySearch(key,low,high,arr);
	 
		 
 } */
           
     /****************************************************************/
            // DayOfWeek Implementation
            
            public static void dayOfWeek(int m,int d,int year)
            {
            
            if(m<1 || m>12)
            
            System.out.println("Invalid month");
            
            if(d<1 ||d>31)
            
            System.out.println("Invalid day");
            
            if(year<-10000 || year>10000)
            
            System.out.println("Invalid year");
            
            int y0=year - (14 - m)/12;
            int x=y0+y0/4 - y0/100 +y0/400;
            int m0=m+12*((14-m)/12)-2;
            int d0=(d+x+31*m0/12)%7;
            System.out.println(d0);
            if(d0==0)
            System.out.println("Sunday");
            else if(d0==1)
            System.out.println("Monday");
            else if(d0==2)
            System.out.println("Tuesday");
            else if(d0==3)
            System.out.println("wednesday");
            else if(d0==4)
            System.out.println("Thursday");
            else if(d0==5)
            System.out.println("Friday");
            else
            System.out.println("Saturday");

 }
 /************************************************************/
            //Temperature Conversion implementation //
           public static void temperatureConversion(double CTF,double FTC)
       {
            System.out.println("Celsius to Fahrenheit" +CTF);
            System.out.println("Fahrenheit to Celsius" +FTC);
       }
            
}
	
	