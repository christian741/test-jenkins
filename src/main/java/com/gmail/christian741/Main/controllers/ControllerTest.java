package com.gmail.christian741.Main.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class ControllerTest {

	@GetMapping("/getAlls")
	public ResponseEntity<?> getAlls(
			){
		
		return new ResponseEntity<String>("hello world",HttpStatus.OK);
	}
}
