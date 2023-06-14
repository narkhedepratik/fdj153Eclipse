package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/msg")
	public String getMsg()
	{
		
		return "I am Dev 1";
	}
	
	@GetMapping("/msg2")
	public String getMsg2()
	{
		
		return "I am Dev 2";
	}
}
