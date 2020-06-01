package com.cwright.ws.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	public static final String template = "Hello, %s!";
	
	@GetMapping("/test")
	public Hello sayHello(@RequestParam(value="name", defaultValue = "world") String name) {
		return new Hello(String.format(template, name));
	}
	
}
