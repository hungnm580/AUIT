package com.fit.WebElement;

import java.util.ArrayList;

public class WebElement {
	private int id;
	private String htmlId;
	private String type;
	private String name;
	private String className;
	private ArrayList<String> values;
	
	public WebElement(int _id, String _htmlId, String _type, String _name, String _className, ArrayList<String> _values){
		
	}
	
	public int getId(){return id;}
	public String getHtmlId(){return htmlId;}
	public String getType(){return type;}
	public String getName(){return name;}
	public String getClassName(){return className;}
	public ArrayList<String> getValues(){return values;}
}
