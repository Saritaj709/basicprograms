

package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.*;
import java.util.Scanner;

public class vendingMachine {
public static void main(String[] args)
{
	int i=0;int total=0;
    int[] notes= {1000,500,100,50,5,2,1};
    int money;
    System.out.println("enter change");
    Scanner sc=new Scanner(System.in);
    money=sc.nextInt();
	Utility.vendingMachine(money,notes);
}
}
