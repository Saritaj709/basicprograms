package com.bridgelabz.protypedesignpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees implements Cloneable {
	Scanner scanner = new Scanner(System.in);
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		System.out.println("enter the no. of employees");
		int num = scanner.nextInt();
		System.out.println("enter the employees names");
		for (int i = 0; i < num; i++) {
			empList.add(scanner.next());
		}
	}

	public List<String> getEmpList() {
		return empList;
	}

	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String name : this.getEmpList()) {
			temp.add(name);
		}
		return new Employees(temp);
	}
}
