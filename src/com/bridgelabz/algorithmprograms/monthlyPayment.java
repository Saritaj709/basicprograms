

package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.*;

public class monthlyPayment {
	public static void main(String[] args)
	{ double P = 0,Y = 0,R = 0;
       try {
		P=Double.parseDouble(args[0]);
		Y=Double.parseDouble(args[1]);
		R=Double.parseDouble(args[2]);
       }
		catch(Exception e){
			System.out.println("array index out of bound,enter values");
		}
       Utility.monthlyPayment(P,Y,R);
	}

}
