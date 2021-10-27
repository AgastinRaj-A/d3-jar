package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test1Model;


@RestController
public class ServiceController {
	
	@Autowired
	private FeignProxy proxy;
	
	@GetMapping("/dbTest")
	public List<Test1Model> returnTest1() {
		return proxy.returnTest2();
		
	}


}
