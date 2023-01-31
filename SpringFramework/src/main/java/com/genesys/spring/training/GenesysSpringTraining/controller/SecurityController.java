package com.genesys.spring.training.GenesysSpringTraining.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class SecurityController {
	@RequestMapping(value = "/authenticate")
	public String sayHello() {
		return "Hello World";
	}
}
