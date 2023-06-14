package com.cjc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutujaController {
	@GetMapping("/msg")
	public String getMsg()
	{
		return "I am dev";
	}

}
