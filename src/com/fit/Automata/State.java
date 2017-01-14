package com.fit.Automata;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class State {
	private int id;
	private String name;
	private HashMap<String, String> listElementsStatus;
	
	public State(String _name, HashMap<String, String> _listElementsStatus){
		name = _name;
		listElementsStatus = _listElementsStatus;
	}
	
	public int getId(){return id;}
	public String getName(){return name;}
	
	public void printState(){
		//TODO
	}
	
	/**
	 * Using selenium driver to check if the state's attributes are correct
	 * @param driver
	 * @param testNumber
	 * @return
	 */
	public boolean checkState(WebDriver driver, int testNumber){
		//TODO
		return true;
	}
}
