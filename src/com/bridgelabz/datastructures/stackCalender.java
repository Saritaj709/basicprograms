package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class stackCalender {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		stackList first[][] = new stackList[6][];
		for (int i = 0; i < 6; i++) {
			first[i] = new stackList[7];
			for (int j = 0; j < 7; j++) {
				first[i][j] = new stackList();
			}
		}

		stackList a[][] = new stackList[6][];
		for (int i = 0; i < 6; i++) {
			a[i] = new stackList[7];
			for (int j = 0; j < 7; j++) {
				a[i][j] = new stackList();
			}
		}
		int d = 1;
		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				first[i][j].push("  ");
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (Utility.dateValidator(d, m, y)) {
					j = Utility.dayStart(d, m, y);
					if (d < 10) {
						first[i][j].pop();
						first[i][j].push(" " + d);
						d++;
					} else {
						first[i][j].pop();
						first[i][j].push("" + d);
						d++;
					}
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j].push(first[i][j].pop());
			}
		}

		// System.out.println("printing");
		// System.out.println(a[0][6].size());
		System.out.println(months[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(days[i] + "  ");
		}
		System.out.println();
		System.out.println("--------------------------");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(a[i][j].pop() + "  ");
			}
			System.out.println();
		}

	}
}
