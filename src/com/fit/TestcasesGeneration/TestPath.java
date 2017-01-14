package com.fit.TestcasesGeneration;

import java.util.ArrayList;

import com.fit.Automata.State;

/**
 * A test path is represent by a list of States
 * @author Hung
 *
 */
public class TestPath {
	private ArrayList<State> listStates;
	
	public TestPath(ArrayList<State> _listStates){
		listStates = _listStates;
	}
	
	public ArrayList<State> getListStates(){return listStates;}
	
	public void Add(State state){
		listStates.add(state);
	}
}
