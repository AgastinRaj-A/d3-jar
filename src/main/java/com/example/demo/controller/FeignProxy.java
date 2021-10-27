package com.example.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Test1Model;

@FeignClient(name="${service.call}")
public interface FeignProxy {
	
	@GetMapping("/dbTest")
	public List<Test1Model> returnTest2();

}

	
	