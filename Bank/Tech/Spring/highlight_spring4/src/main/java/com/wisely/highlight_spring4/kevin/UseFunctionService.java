package com.wisely.highlight_spring4.kevin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	
	@Autowired
	FunctionService functionservice;
	
	public String SayHello(String word) {
		return functionservice.sayHello(word);
	}

}
