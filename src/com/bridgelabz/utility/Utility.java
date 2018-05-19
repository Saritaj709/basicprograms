package com.bridgelabz.utility;

import com.bridgelabz.functionprogs.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.Math;
import java.util.Arrays;

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

	public static void stopWatch(long s, long e) {
		s = System.nanoTime();
		System.out.println("calculating time from " + s + "nano secs" + e + "micro sec");
		e = System.nanoTime();
		long total_time = e - s;
		System.out.println("Time measured is:  " + total_time + "nano secs");

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

}

	