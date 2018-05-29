package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class calenderMonth {
	public static void main(String[] args)
	{
		    int month =Integer.parseInt(args[0]);
		    int year=Integer.parseInt(args[1]);
		    if(month < 1 || month > 12)
		    {
		        System.out.println("Invalid month. Valids inputs are 1-12.");
		        System.exit(0);
		    }

		    if(year < 1753)
		    {
		        System.out.println("Invalid year. Valid inputs are 1753 and beyond.");
		        System.exit(0);
		    }
		    if(Utility.leap(year))
		    {
		        System.out.println(year + " is a leap year.");
		    }
		    else
		    {
		        System.out.println(year + " is NOT a leap year.");
		    }
		    Utility.firstDayOfYear(year);
		    Utility.firstDayOfMonth(month, year);
		    Utility.numDaysInMonth(month, year);
		    Utility.printCal(month, year);
		}   
	}


