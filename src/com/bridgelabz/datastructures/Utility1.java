package com.bridgelabz.datastructures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utility1 {
public static Scanner sc=new Scanner(System.in);
public static String userString()
{
	String str=sc.nextLine();
	return str;
}
public void FileWriter(String word)
{
	try {
		File fi=new File("/home/bridgelabz/JSarita/DataStructures/list");
		fi.createNewFile();
		FileWriter fw=new FileWriter(fi);
		fw.write(word);
		fw.close();
	}
	catch(IOException e)
	{
	}
}
}
/*public Node bufferedReader(Node start)
{

	try {
		FileInputStream fis=new FileInputStream("/home/bridgelabz/JSarita/DataStructures/list");
		char ch;
		String word3="";
		while(fis.available()>0)
		{
			ch=(char)fis.read();
			word3=word3+ch;
		}
	String[] wordsArray=word3.split(" ");
	for(int i=0;i<wordsArray.length;i++)
	{
		start=addWordstoList(start,wordsArray[i]);
	}
	}
	catch(NullPointerException ne)
	{
		System.out.println(ne);
	}
	catch(IOException e)
	{
	}
	return start;
}*/
/*public static String[] fileReaderAndSplitter() throws IOException
{
	FileReader fileReader=new FileReader("/home/bridgelabz/JSarita/DataStructures/list");
    Object bufferedReader;
	String str=((Object) bufferedReader).readLine();
    int count=0;
    for(int i=0;i<str.length();i++)
    {
    	if(str.charAt(i)==' '&& str.charAt(i+1)!=' '
    			|| str.charAt(i)=='.' && str.charAt(i+1)!='.'
    			||str.charAt(i)==','||str.charAt(i)==',')
    	{
    		count++;
    	}
    }
    String arr[]=new String[count+1];
    int j=0;
    String temp="";
    for(int i=0;i<str.length();i++)
    {
    	if(str.charAt(i)!=' ')
    	{
    		temp +=str.charAt(i);
    	}
    	else
    	{
    		arr[j]=temp;
    		temp="";
    		j++;
    	}
    }
    arr[j]=temp;
    bufferedReader.close();
    
    return arr;
}
}*/
