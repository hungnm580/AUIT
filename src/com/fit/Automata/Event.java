package com.fit.Automata;

import org.openqa.selenium.WebDriver;

public class Event {
	private int id;
	private String name;
	private String htmlId;
	private String action;
	
	public Event(int _id, String _name, String _htmlId, String _action){
		id = _id;
		name = _name;
		htmlId = _htmlId;
		action = _action;
	}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public String getHtmlId(){return htmlId;}
	public String getAction(){return action;}
	
	/**
	 * Use selenium driver to perform the the action
	 * @param driver
	 * @param numberTest
	 */
	public void performAction(WebDriver driver, int numberTest){
		//TODO
	}

}
