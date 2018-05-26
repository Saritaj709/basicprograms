/****************************************************************************/
/**
	* Created by: Sarita
	* Date: 24-05-2018
	* Purpose: Putting Commonly used function in single file.
		1 function to take word,integer and double as input
		2: function to read and write file.
		3 function to match regex from string and replace with user details	 
	**/
/***************************************************************************/
package com.bridgelabz.utility;

	import java.io.BufferedReader;
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
	//import com.bridgelabz.task.UserDetails;
	import java.util.Random;
import java.util.Scanner;
import java.io.File;
	import java.io.FileWriter;

	public class Utility1
	{
		
        static Scanner sc=new Scanner(System.in);
		BufferedReader br;
		private final String REGEX_NAME = "<<name>>";
		private final String REGEX_FULLNAME = "<<full name>> ";
		private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
		private final String REGEX_DATE = "12/06/2016";
		
		//constructor to initialize bufferedReader
		public void Utility(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		//Regex pattern matcher match the string and replace the regex pattern with user details.
	/*	public String convertString(UserDetails userDetails,String message){
			Pattern p = Pattern.compile(REGEX_NAME);
			Matcher m = p.matcher(message); 
			message = m.replaceAll(userDetails.getfName());

			p = Pattern.compile(REGEX_FULLNAME);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

			p = Pattern.compile(REGEX_MOBILE_NO);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.mobileNo());

			p = Pattern.compile(REGEX_DATE);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.date());

			return message;
		}*/
		
		//take input word
		public String inputString(){
		 String str=sc.nextLine();
			return str;
		}

		//Take Integer Input
		public int inputInteger(){
			try{
				int number=sc.nextInt();
				return number;
			}catch(Exception e) {
			    sc.nextLine();
			    System.out.println("Invalid number,please try again..");
				return inputInteger();
			}
		}

		//Take Double Input
		public double inputDouble(){
			try{
				try{	
					return Double.parseDouble(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0.0;
		}

		//Take number of random number to generate as input and return array of random number
		public int[] getRandomArray(int number){
			Random randomGenerator = new Random();
			int array[]=new int[number];
			for(int i=0;i<number;i++){
				array[i]=randomGenerator.nextInt();
			}
			return array;
		}
	}

		//Read the file  and take stock details as input and return array-list of stock details
	/*	public ArrayList<Stock> getStockDetails(String fileName){
			ArrayList<Stock> stockList=new ArrayList<Stock>();
			try{
				br=new BufferedReader(new FileReader(fileName));
				StringBuilder sb=new StringBuilder();
				String line=br.readLine();
				SortingFunction sortingFunction=new SortingFunction();
				while(line!=null){
					String words[]=sortingFunction.wordsArrayFromStatement(line);
					try{
						stockList.add(new Stock(words[0],Integer.parseInt(words[1]),Integer.parseInt(words[2])));
					}
					catch(NumberFormatException nfe){
					}
					catch(ArrayIndexOutOfBoundsException ae){
					}
					line=br.readLine();
				}
				return stockList;
			 }
			catch(Exception e){
				return null;
			}
			finally{
				try{
					br.close();
				}
				catch(IOException ioe){
				}	
			}
		}
*/
		//Function take String in dd/mm/yyyy format and return Date Object
/*		public Date printDate(String date){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			try{
				return sdf.parse(date);
			}
			catch(ParseException pe){
				return null;
			}
		}

*/