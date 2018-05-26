/****************************************************************************/  
/**	*Created by:sarita
	*Date: 24/05/2018
	*Purpose:read an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)
	*Ensure parentheses must appear in a balanced or not.
/****************************************************************************/

    package com.bridgelabz.datastructures;
	import java.util.Scanner;

public class balancedParenthesis {
		
		private static Scanner sc;

		public static void main(String[] args) 
		{
		sc = new Scanner(System.in);
		System.out.println("enter max size:");
		int n =sc.nextInt();		
		// creating Stack//
		 stackLogic.StackLogic(n);
		System.out.println();
		System.out.println("parenthesis matching");
		System.out.println();
		
		// Accepting expression //
		System.out.println("Enter expression:\n");
		String exp=sc.next();
		int len=exp.length();
		System.out.println("matches and mismatches:");
		
		for(int i=0;i<len;i++)
		{
			char ch=exp.charAt(i);
			if(ch=='(')
			{
				stackLogic.push(i);
			}
			else if(ch==')')
			{
				try
				{
					long p=(stackLogic.pop()+1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
				}
				catch(Exception e)
				{
					System.out.println(" ')' at index "+(i+1)+" is unmatched");
				}
			}
		}
		while(!stackLogic.isEmpty())
		{
			System.out.println(" '(' at index "+(stackLogic.pop()+1)+ " is matched");
		}
	}
}