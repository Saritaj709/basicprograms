package com.bridgelabz.oops.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.init.UserDetails;

public class Utility1 {
	BufferedReader br;
	private final String REGEX_NAME="<<name>>";
	private final String REGEX_FULLNAME="<<full name>>";
	private final String REGEX_MOBILENO="xxxxxxxxxx";
	private final String REGEX_DATE="xx/xx/xxxx";
	
	public Utility1()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	public String convertString(UserDetails userdetails,String message)
	{
		Pattern p=Pattern.compile(REGEX_NAME);
		Matcher m=p.matcher(message);
		message =m.replaceAll(userdetails.getFname());
		
		p=Pattern.compile(REGEX_FULLNAME);
		m=p.matcher(message);
		message=m.replaceAll(userdetails.getFname()+" "+userdetails.getLname());
	
		p=Pattern.compile(REGEX_MOBILENO);
		m=p.matcher(message);
		message=m.replaceAll(userdetails.getMobileNo());
		
		p=Pattern.compile(REGEX_DATE);
		m=p.matcher(message);
		message=m.replaceAll(userdetails.getDate());
		
		return message;
	}
	public String getFormatedDate(Date date)
	{
		SimpleDateFormat sdf=new SimpleDateFormat();
		return sdf.format(date);
	}
public String getFileText(String fileName)
{
	try {
		br=new BufferedReader(new FileReader(fileName));
		StringBuilder sb=new StringBuilder();
		String line=br.readLine();
		while(line!=null)
		{
			sb.append(line);
			sb.append(System.lineSeparator());
			line=br.readLine();
		}
		return sb.toString();
	}
	catch(Exception e)
	{
		return null;
	}
	finally
	{
		try
		{
			br.close();
		}
		catch(IOException ioe)
		{
	}
}
}
/***************************************************************************/

}
