package com.bridgelabz.generics;

public class genericSample {
		/*public static String stringMax(String s1,String s2,String s3)
		{		
			return (s1.compareTo(s2)>0 && s1.compareTo(s3)>0)?s1 : 
				(s2.compareTo(s1)>0 && s2.compareTo(s3)>0)?s2:s3;
			
		}
		public static int intMax(int x,int y,int z) {
		return x>y?(x>z?x:z):(y>z?y:z);
		}*/
		public static <T extends Comparable<T>> T max(T a,T b,T c)
		{
			return (a.compareTo(b)>0 ?((a.compareTo(c)>0) ? a:b):c);
		}

		public static void main(String[] args)
		{
			int x=20,y=30,z=90;
			String s1="ab",s2="bb",s3="cn";
			System.out.println(max(s1,s2,s3));
			System.out.println(+max(x,y,z));
			
		}

}
