package com.wisely.highlight_spring4.wuyoteng;

import org.springframework.stereotype.Service;

public class UseFunctionService {
	
	FunctionService functionservice;
	
	public void setFunctionService(FunctionService functionservice) {
		this.functionservice = functionservice;
		
	}
	
	public String SayHello(String word) {
		return functionservice.sayHello(word);
	}

}
