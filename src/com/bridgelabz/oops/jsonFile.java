package com.bridgelabz.oops;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class jsonFile {
@SuppressWarnings("unchecked")
public static void main(String[] args) throws FileNotFoundException
{
	JSONObject ob=new JSONObject();
	
	//ob.put("NameofItem","Rice,pulse,wheat");
	ob.put("Inventory1","Item1");
	ob.put("Inventory2","Item2");
	ob.put("Inventory2","Item2");
	
	//ob.put("price",70);
	JSONArray ja=new JSONArray();
	Map<Object, Object> m=new LinkedHashMap<Object, Object>(9);
	m=new LinkedHashMap<Object, Object>(3);
	m.put("Name","Rice");
	m.put("Weight", 50);
	m.put("price",45);
	ja.add(m); 
	ob.put("Inventory1",m);
	
	m= new LinkedHashMap<Object, Object>(3);
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
	
	PrintWriter pw=new PrintWriter("jsonfile.json");
	pw.write(ob.toJSONString());
	pw.flush();
	pw.close();
}
}
