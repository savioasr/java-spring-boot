package com.schoolofnet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping
	@ResponseBody
	public String hello() {
		return "Hello World 123";
	}
	
	@GetMapping(path = "/say/{name}")
	@ResponseBody
	public String say(@PathVariable String name) {
		return "New Method " + name;
	}
	
	@PostMapping(path = "/say")
	@ResponseBody
	public String sayPost(@PathVariable String name) {
		return "New Method Post " + name;
	}
}