package com.bridgelabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.addressbook.Person;
import com.bridgelabz.utility.Utility;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;

public class JsonFile {
@SuppressWarnings("unchecked")
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ParseException
{
	JSONObject ob=new JSONObject();
	Person p=new Person();
	ObjectMapper mapper=new ObjectMapper();
	//ob.put("NameofItem","Rice,pulse,wheat");
	/*ob.put("Inventory1","Item1");
	ob.put("Inventory2","Item2");
	ob.put("Inventory4","Item2");
	*/
	//ob.put("price",70);
	JSONArray ja=new JSONArray();
	Map<Object, Object> m=new LinkedHashMap<Object, Object>(100);
	m=new LinkedHashMap<Object, Object>(100);
	System.out.println("enter the no. of person");
	int n=Utility.userInt();
	for(int i=0;i<n;i++) {
	Object obj = new JSONParser().parse(new FileReader("jsonfile.json"));
	System.out.println("enter firstname,lastname,address,city,zip,phone");
	m.put("firstname",p.setFirstName(Utility.userString()));
	m.put("lastname",p.setLastName(Utility.userString()));
	m.put("address",p.setAddress(Utility.userString()));
	m.put("city",p.setCity(Utility.userString()));
	m.put("zip",p.setZip(Utility.userString()));
	m.put("phone",p.setPhone(Utility.userString())); 
	ja.add(m);
	ob.put("person"+i,m);
	
	/*m= new LinkedHashMap<Object, Object>(3);
	m.put("Name","Pulse");
	m.put("Weight", 19);
	m.put("price", 60);
	ja.add(m);
	ob.put("Inventory2",m);
	
	m=new LinkedHashMap<Object, Object>(3);
	m.put("Name", "Wheat");
	m.put("weight", 59);
	m.put("Name", 30);
    ob.put("Inventory3",m);
	ja.add(m);
	*/
	//mapper.writeValue(new File("/home/bridgelabz/JSarita/DataStructures/jsonfile.json"),ob);
	PrintWriter pw=new PrintWriter("jsonfile.json");
	pw.write(ob.toJSONString());
	pw.flush();
	pw.close();
}
}
}

