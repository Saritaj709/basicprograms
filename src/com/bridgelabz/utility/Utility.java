package com.bridgelabz.utility;

import java.util.Scanner;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

//import com.bridgelabz.task.Stock;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.bridgelabz.task.UserDetails
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;

public class Utility
{
	BufferedReader br;
	private final String REGEX_NAME="<<name>>";
	private final String REGEX_FULLNAME="<<full name>>";
	private final String REGEX_MOBILE_NO="XXXXXXXXXX";
	private final String REGEX_DATE="23/05/2018";
	//constructer to initialize buffered reader
	public Utility() {
	 br=new BufferedReader(new InputStreamReader(System.in));	
	}
public static String inputString()
{
	Scanner sc=new Scanner(System.in);
    String val=sc.nextLine();
    return val;
}

}
