package com.fit.Automata;

import com.fit.Automata.GuardCondition;

import org.openqa.selenium.WebDriver;

import com.fit.Automata.Event;
import com.fit.Automata.State;

public class Transition {
	private int id;
	private State beginState;
	private State endState;
	private Event event;
	private GuardCondition condition;
	
	public Transition(int _id, State _beginState, State _endState, Event _event, GuardCondition _condition){
		id = _id;
		beginState = _beginState;
		endState = _endState;
		event = _event;
		condition = _condition;
	}
	
	public State getBeginState(){return beginState;}
	public State getEndState(){return endState;}
	
	/**
	 * Using selenium driver to check if the condition is met
	 * @param driver
	 * @param numberTest
	 * @return
	 */
	public boolean checkCondition(WebDriver driver, int numberTest){
		//TODO
		return true;
	}
	
	public void printTransition(){
		//TODO
	}
}
