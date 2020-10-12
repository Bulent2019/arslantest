package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // to print on the screen
public class HelloController {
	@RequestMapping("/hello") // every request is mapped! for example localhost:8080/* here you can write anything and it will work or make it specific
	public String hello() {
		return "Hello Spring";
	}
}
