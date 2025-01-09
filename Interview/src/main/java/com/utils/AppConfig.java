package com.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	
	@Bean
	public Functions urlValidator() {
		return new Functions();
	}
	
	@Bean
    public Element element() {
        return new Element();
    }

}
