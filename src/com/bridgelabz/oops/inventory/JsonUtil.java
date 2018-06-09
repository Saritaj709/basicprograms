package com.bridgelabz.oops.inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabz.oops.addressbook.Person;

public class JsonUtil {
	List<Person> list=new ArrayList<>();
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	public static String ConvertJavaToJson(Object object) {
		String jsonResult = "";
		try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Jsongeneration Exception " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}
		return jsonResult;
	}
	public static void toJson(File file,Object object)throws Exception
	{
		// Person person = new Person();
		file=new File("pretty.json");
		ObjectMapper mapper=new ObjectMapper();
		ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
		writer.writeValue(file,object);
		System.out.println("done");
	}
	public static void writeFile(File file) throws FileNotFoundException
	{
		PrintWriter pw=new PrintWriter("jsonfile.json");
		//pw.write(ob.toJSONString());
		pw.flush();
		pw.close();
	}
	public static void dateTime()
	{
		int day, month, year;
	      int second, minute, hour;
	      GregorianCalendar date = new GregorianCalendar();
	 
	      day = date.get(Calendar.DAY_OF_MONTH);
	      month = date.get(Calendar.MONTH);
	      year = date.get(Calendar.YEAR);
	 
	      second = date.get(Calendar.SECOND);
	      minute = date.get(Calendar.MINUTE);
	      hour = date.get(Calendar.HOUR);
	 
	      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
	      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
}
	public static void saveToJson(File file, List<Person> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		writer.writeValue(file, list);
		System.out.println("done file");
	}
	public static <T>List JsonParser(File file,Class<T> parser) throws JsonParseException, JsonMappingException, IOException
	{
		List<T> list=new ArrayList<T>();
		CollectionType javaType=mapper.getTypeFactory().constructCollectionType(List.class, parser);
		list=mapper.readValue(file, javaType);
		return list;
	}
}