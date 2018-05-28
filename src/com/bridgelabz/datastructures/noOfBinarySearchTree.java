package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class noOfBinarySearchTree {
	
		public long factorial(long n)
		{
		    int res = 1;
		 
		    // Calculate value of [1*(2)*---*(n-k+1)] / [k*(k-1)*---*1]
		    for (int i = 1; i <= n; ++i)
		    {
		        res *= i;
		    }
		 
		    return res;
		}
		 
		public long binomialCoeff(long n,long k)
		{
		    int res = 1;
		 
		    // Since C(n, k) = C(n, n-k)
		    if (k > n - k)
		        k = n - k;
		 
		    // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
		    for (int i = 0; i < k; ++i)
		    {
		        res *= (n - i);
		        res /= (i + 1);
		    }
		 
		    return res;
		} 
		// A Binomial coefficient based function to find nth catalan
		// number in O(n) time
		public long catalan(long n)
		{
		     long c = binomialCoeff(2*n, n);
		    return c/(n+1);
		}
		public long countBST(long n)
		{
		    long count = catalan(n);
		    return count;
		}
		public long countBT(long n)
		{
		    long count = catalan(n);
		    return count * factorial(n);
		}

		public static void main(String[] args)
		{
		 
		    long count1,count2;
		    System.out.println("enter the no. of nodes to create no. of binary tree");
		    int n=Utility.userInt();  
		    noOfBinarySearchTree bst=new noOfBinarySearchTree();
		        count1 = bst.countBST(n);
		        count2 = bst.countBT(n); 
		    System.out.println("Count of BST with "+n +" nodes is "+count1);
		       System.out.println("Count of binary trees with "+n +" nodes is "+count2);
		 
		}
	}
