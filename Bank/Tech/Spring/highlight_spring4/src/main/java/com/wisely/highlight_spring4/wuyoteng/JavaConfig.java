package com.wisely.highlight_spring4.wuyoteng;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
	
	

}
