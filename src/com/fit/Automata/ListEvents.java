package com.fit.Automata;

import java.util.ArrayList;

import com.fit.Automata.Event;

public class ListEvents {
	ArrayList<Event> listEvents;
	
	public ListEvents(){
		listEvents=new ArrayList<Event>();
	}
	
	public void addEvent(Event e){
		listEvents.add(e);
	}
	
	public Event getEventByIndex(int index){
		return listEvents.get(index);
	}
	
	public Event getEventByName(String _name){
		for (int i=0 ; i<listEvents.size() ; i++){
			if (listEvents.get(i).getName().compareTo(_name) == 0){
				return listEvents.get(i);
			}
		}
		return null;
	}
	
	
	public int getSize(){
		return listEvents.size();
	}
}
