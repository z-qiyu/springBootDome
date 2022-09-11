package com.zqy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/hello/all")
	@ResponseBody
	public String helloAll() {
		return "hello world all";
	}
}
