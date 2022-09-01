package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feig.Feignclientutil;

@RestController
@RequestMapping("/demo")
public class fiegncontroller {
	
	@Autowired
	private Feignclientutil feign;
	
	@GetMapping("/name")
	public String getna() {
		return feign.getname();
	}

}
