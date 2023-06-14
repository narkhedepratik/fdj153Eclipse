package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PrashantController {

	@GetMapping("/prashant")
	public String getmsg()
	{
		return "I AM Prashant";
	}
}
