/******************************************************************************
 *  Compilation:  javac -d bin temperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.temperatureConversion.java C,F where C=celsius temperature,F=fahrenheit temperature
 *  Purpose:Converts celsius temperature to fahrenheit and vice-versa
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import  com.bridgelabz.utility.Utility;

public class TemperatureConversion {
public static void main(String[] args)
{
	 double C,F,CTF,FTC;
     C=Double.parseDouble(args[0]);
     F=Double.parseDouble(args[1]);
     CTF=(C*9/5)+32;
     FTC=(F-32)*5/9;
     Utility.temperatureConversion(CTF, FTC);
}
}
