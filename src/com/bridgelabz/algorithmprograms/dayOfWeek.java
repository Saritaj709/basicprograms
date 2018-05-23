package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.*;
public class dayOfWeek {
	public static void main(String[] args)
	{
		int m,d;
        int year;
        System.out.println("Month is " +args[0]);
        System.out.println("Day is " +args[1]);
        m=Integer.parseInt(args[0]);
        d=Integer.parseInt(args[1]);
        year=Integer.parseInt(args[2]);
        Utility.dayOfWeek(m,d,year);
	}

}
