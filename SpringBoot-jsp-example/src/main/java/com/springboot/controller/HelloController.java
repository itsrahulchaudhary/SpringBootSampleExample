package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 

@Controller
public class HelloController {
	
	@RequestMapping({"/", "/hello"})
	public String hello(@RequestParam(value="name", defaultValue="World", required=true) String name , Model model) {
		model.addAttribute("name", name);
		 return "hello";
	}

}
