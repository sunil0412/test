package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/doconserv")
@CrossOrigin(origins = "*")
public class DemoController {
	@GetMapping("/demo")
	public @ResponseBody String getDemo() {
		return "Hi";
		
	}
}
