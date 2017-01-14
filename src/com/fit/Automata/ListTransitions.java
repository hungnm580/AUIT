package com.fit.Automata;

import java.util.ArrayList;

import com.fit.Automata.State;
import com.fit.Automata.Transition;

public class ListTransitions {
	ArrayList<Transition> listTransitions;
	
	public ListTransitions(){
		listTransitions = new ArrayList<Transition>();
	}
	
	public int getSize(){
		return listTransitions.size();
	}
	
	public void addTransition(Transition _t){
		listTransitions.add(_t);
	}
	
	public Transition getTransitionByIndex(int index){
		return listTransitions.get(index);
	}
	
	/**
	 * Find list of transitions by begin state and end state
	 * @param beginState
	 * @param endState
	 * @return
	 */
	public ArrayList<Transition> findListTransitionsByTwoStates(State beginState, State endState){
		
		ArrayList<Transition> listTrans = new ArrayList<Transition>();
		
		for (int i=0; i<listTransitions.size(); i++){
			if (beginState==listTransitions.get(i).getBeginState() && endState==listTransitions.get(i).getEndState()){
				listTrans.add(listTransitions.get(i));
			}
		}
		
		return listTrans;
	}
}
