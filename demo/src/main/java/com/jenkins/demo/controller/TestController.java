package com.jenkins.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/printRequest")
	public ResponseEntity<String> printRequest(@RequestParam String name){
		System.out.println("TestController Name =================="+name);
		return new ResponseEntity<String>(name , HttpStatus.OK);
	}

}
