package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utils.Data;
import com.utils.Element;
import com.utils.Functions;




@RestController
public class Resources {
	
	
	 
	 @Autowired
	 private Element element;
	 
	 @Autowired
	 private Functions functions;
	 
	
	/*
	@GetMapping("/test/geturl")
	public String getUrl(@RequestBody Data data) {
		
		System.out.println(data);
		
		// Validar una URL
		if (functions.urlValidator(data.getKey())) {
            return "The URL " + data.getKey() + " is valid";
        } else {
            return "The URL " + data.getKey() + " isn't valid";
        }	
		
		
		
	}*/
	
	@PostMapping("/test/geturl")
    public ResponseEntity<String> getUrl(@RequestBody Data data) {

        // Validar una URL
        if (functions.urlValidator(data.getKey())) {
            return new ResponseEntity<>("The URL " + data.getKey() + " is valid", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("The URL " + data.getKey() + " isn't valid", HttpStatus.BAD_REQUEST);
        }
    } 
	 
	
	@GetMapping("/test/getkind/{type}")
	public String getKind(@PathVariable("type") String type) {
		
				
		String res = element.getElements().get(type);
		
		return res;		
		
	}
	
	@GetMapping("/test/getkind2/")
	public String getKind2(@RequestParam("type") String type) {
		
				
		String res = element.getElements().get(type);
		
		return res;				
		
	}
	
	
}
