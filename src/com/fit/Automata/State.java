package com.fit.Automata;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class State {
	private String name;
	private HashMap<String, String> listElementsStatus;
	
	public State(String _name, HashMap<String, String> _listElementsStatus){
		name = _name;
		listElementsStatus = _listElementsStatus;
	}
	
	public void printState(){
		//TODO
	}
	
	public boolean checkState(WebDriver driver, int testNumber){
		//TODO
		return true;
	}
}
