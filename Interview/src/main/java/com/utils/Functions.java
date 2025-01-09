package com.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//@Component //Se puede habilitar esta anotacion y eliminar la anotacion en AppConfig
public class Functions {
	
	
	
	private static final String URL_REGEX =
            "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
            "(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
            "([).!';/?:,][[:blank:]])?$";
 
	private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);
	
	
	public boolean urlValidator(String url)
    {
        if (url == null) {
            return false;
        }
 
        Matcher matcher = URL_PATTERN.matcher(url);
        return matcher.matches();
    }

}
