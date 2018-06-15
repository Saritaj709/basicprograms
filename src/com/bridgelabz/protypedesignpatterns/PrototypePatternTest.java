package com.bridgelabz.protypedesignpatterns;

import java.util.List;
import java.util.Scanner;

public class PrototypePatternTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		System.out.println("enter a string to add in list");
		list.add(scanner.next());
		List<String> list1 = empsNew1.getEmpList();
		System.out.println("enter a name to remove from list");
		list1.remove(scanner.next());
		System.out.println("emp List : " + emps.getEmpList());
		System.out.println("empsNew List : " + list);
		System.out.println("empsNew1 List : " + list1);
	}
}
