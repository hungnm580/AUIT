package com.fit.WebElement;
import java.util.ArrayList;

public class ListWebElements {
	ArrayList<WebElement> arrElements;
	public ListWebElements(){
		arrElements = new ArrayList<WebElement>();
	}
	
	public void addElement(WebElement e){
		arrElements.add(e);
	}
	
	public WebElement getElementById(int id){
		
		for (int i=0; i<arrElements.size(); i++){
			if (arrElements.get(i).getId()==id){
				return arrElements.get(i);
			}
		}
		
		return null;
		
	}
	
	public boolean checkExist(String htmlId){
		for (int i=0 ; i<arrElements.size() ; i++){
			if (arrElements.get(i).getHtmlId().equals(htmlId)){
				return true;
			}
		}
		return false;
	}
	
	public WebElement getElementByName(String html_id){
		for (int i=0 ; i<arrElements.size() ; i++){
			if (arrElements.get(i).getHtmlId().equals(html_id)){
				return arrElements.get(i);
			}
		}
		return null;
	}
	
	public WebElement getElementByIndex(int index){
		return arrElements.get(index);
	}
	
	public int getSize(){
		return arrElements.size();
	}
}
