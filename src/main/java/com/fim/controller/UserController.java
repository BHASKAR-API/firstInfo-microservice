package com.fim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/get")
	public String heartBeat() {
		return "Application Started Successfully remotely updated.............";
	}

	//commit-1
	@GetMapping("/get")
	public void get()
	{
		
		//String name = "SOMU";
		
		//added method
		
		//festure/01
		//fsda
		//fsgs
	}

}
