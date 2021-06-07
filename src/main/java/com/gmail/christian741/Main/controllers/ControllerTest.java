package com.gmail.christian741.Main.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerTest {

	@GetMapping
	public ResponseEntity<?> getAlls(
			){
		
		return new ResponseEntity<String>("hello world",HttpStatus.OK);
	}
}
