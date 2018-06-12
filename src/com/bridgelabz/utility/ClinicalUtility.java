package com.bridgelabz.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class ClinicalUtility {
	static ObjectMapper mapper=new ObjectMapper();
 static Scanner scanner=new Scanner(System.in);
public static int userInteger()
{
	try
	{
		//System.out.println("enter the integer value");
		int value=scanner.nextInt();
		return value;
	}
	catch(Exception e)
	{
		scanner.nextLine();
		System.out.println("invalid input,try again");
      return userInteger();
	}
}
public static String userString()
{
		//System.out.println("enter the string");
		String value=scanner.nextLine();
		return value;
}
public static String userNext()
{
	//System.out.println("enter the one word String");
	String value=scanner.next();
	return value;
}
public static char userCharacter()
{
char[] character=scanner.next().toCharArray();
try
{
	if(character.length>1)
		character=scanner.nextLine().toCharArray();
}
catch(Exception e)
{
	System.out.println("inavlid input");
}
return character[0];
}
public static void dateTimeFormatter()
{
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now=LocalDateTime.now();	
}
public static <T>List jsonParser(File file,Class<T> parser) throws JsonParseException, JsonMappingException, IOException
{
	List<T> list=new ArrayList<T>();
	CollectionType javaType=mapper.getTypeFactory().constructCollectionType(List.class, parser);
	list=mapper.readValue(file, javaType);
	return list;
}
public static void saveJsonDoctor(File file,List<Doctor> data)throws Exception
{
	ObjectMapper mapper=new ObjectMapper();
	ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
	writer.writeValue(file,data);
	System.out.println("saved doctor details");
}
public static void saveJsonPatient(File file,List<Patient> list)throws Exception
{
	ObjectMapper mapper=new ObjectMapper();
	ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
	writer.writeValue(file,list);
}
	public static void saveJsonAppointment(File file,List<Appointment> list)throws Exception
	{
		ObjectMapper mapper=new ObjectMapper();
		ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
		writer.writeValue(file,list);
	System.out.println("saved appointment details");
}
}
