/******************************************************************************
 *  Compilation:  javac -d bin Tic_Tac.java
 *  Execution:    java -cp bin com.bridgelabz.util.Tic_Tac ("X","0")  
 *  Purpose: Determines winner of game tic tac toe
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  05-18-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.Utility;

public class TicTacToeCross {
	public static void main(String[] args)
	{
		Utility t=new Utility();
	int x=0,y=0;
	do
	{
		System.out.println(t.player==Utility.X?"Player X turn":"Player O turn");
		System.out.println("Enter x and y places");
		x=Utility.userInt();
		y=Utility.userInt();
		
		t.putSign(x, y);
		System.out.println(t.toString());
		System.out.println("_____________________________");
		t.displayWinner();
		
	}while(t.isEmpty);
	}
}
