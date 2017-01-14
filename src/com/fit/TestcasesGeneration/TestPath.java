package com.fit.TestcasesGeneration;

import java.util.ArrayList;

import com.fit.Automata.State;

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
