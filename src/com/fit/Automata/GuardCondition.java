package com.fit.Automata;

public class GuardCondition {
	private String htmlId;
	private String value;
	
	public GuardCondition(String _htmlId, String _value){
		htmlId = _htmlId;
		value = _value;
	}
	
	public String getHtmlId(){
		return htmlId;
	}
	
	public String getValue(){
		return value;
	}
}
