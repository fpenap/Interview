package com.utils;

import java.util.HashMap;


//@Component //Se puede habilitar esta anotacion y eliminar la anotacion en AppConfig
public class Element {
	
	private HashMap<String, String> elements;
	
	public Element() {
		
		elements = new HashMap<String, String>();
		
		elements.put("apple", "fruit");
		elements.put("orange", "fruit");
		elements.put("onion", "vegetable");
		elements.put("garlic", "vegetable");
		
	}

	public HashMap<String, String> getElements() {
		return elements;
	}

	public void setElements(HashMap<String, String> elements) {
		this.elements = elements;
	}
	
	
}
