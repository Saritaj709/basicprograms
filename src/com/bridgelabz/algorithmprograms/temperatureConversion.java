package com.bridgelabz.algorithmprograms;
import  com.bridgelabz.utility.*;

public class temperatureConversion {
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
