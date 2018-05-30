package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class calender {
	    	public static void main(String[] args) {
	    		int m = Integer.parseInt(args[0]);
	    		int y = Integer.parseInt(args[1]);
	    		String[][] a = new String[6][7];
	    		int d = 1;
	    		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
	    				           "October", "November", "December" };
	    		String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
	    		for (int i = 0; i < 6; i++) {
	    			for (int j = 0; j < 7; j++) {
	    				a[i][j] = "  ";
	    			}
	    		}
	    		for (int i = 0; i < 6; i++) {
	    			for (int j = 0; j < 7; j++) {
	    				if (Utility.dateValidator(d, m, y)) {
	    					j = Utility.dayStart(d, m, y);
	    					if (d < 10) {
	    						a[i][j] = " " + d++;
	    					} else {
	    						a[i][j] = "" + d++;
	    					}
	    				}

	    			}
	    		}

	    		System.out.println(months[m] + " " + y);
	    		System.out.println();
	    		for (int i = 0; i < 7; i++) {
	    			System.out.print(days[i] + "  ");
	    		}
	    		System.out.println();
	    		System.out.println("--------------------------");
	    		for (int i = 0; i < 6; i++) {
	    			for (int j = 0; j < 7; j++) {
	    				System.out.print(a[i][j] + "  ");
	    			}
	    			System.out.println();
	    		}
	    	}
}
