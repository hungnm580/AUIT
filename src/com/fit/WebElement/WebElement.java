package com.fit.WebElement;

import java.util.ArrayList;

public class WebElement {
	private int id;
	private String htmlId;
	private String type;
	private String name;
	private String className;
	private String parentsPage; //Page to which the element belongs
	private ArrayList<String> values; //Possible inputs for the element
	
	public WebElement(int _id, String _htmlId, String _type, String _name, String _className, ArrayList<String> _values){
		
	}
	
	public int getId(){return id;}
	public String getHtmlId(){return htmlId;}
	public String getType(){return type;}
	public String getName(){return name;}
	public String getClassName(){return className;}
	public String getParentsPage(){return parentsPage;}
	public ArrayList<String> getValues(){return values;}
	public String getValueAt(int i){return values.get(i);}
}
