package com.gmail.christian741.Main.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.christian741.Main.entity.User;
import com.gmail.christian741.Main.Service.*;



@RestController
@RequestMapping("/user")
public class ControllerTest {

	@GetMapping("/getChange")
	public ResponseEntity<?> getAlls(
			){
		
		return new ResponseEntity<String>("Lo que el profesor dijo",HttpStatus.OK);
	}
	
	@Autowired
	private IUserService service;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody User user){
		this.service.saveUser(user);
		return new ResponseEntity<Object>("User Created",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAlls")
	public ResponseEntity<?> getAlls(
			@RequestParam(defaultValue  = "0") int page,
    		@RequestParam(defaultValue = "10") int size,
    		@RequestParam(defaultValue = "id") String order,
    		@RequestParam(defaultValue = "true") boolean asc){
		Page<User> usersPage = service.getUsers(PageRequest.of(page, size, Sort.by(order)));
        if(!asc)
        	usersPage = service.getUsers(PageRequest.of(page, size, Sort.by(order).descending()));
		return new ResponseEntity<Page<User>>(usersPage,HttpStatus.OK);
	}
	
	@GetMapping("/getForId/{id}")
	public ResponseEntity<?> getForId(@PathVariable Integer id){
		User user = this.service.getUserById(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PutMapping ("/update/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id,@RequestBody User user){
		this.service.updateUser(user);
		return new ResponseEntity<Object>("User Update",HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		this.service.blockUser(id);
		return new ResponseEntity<Object>("User Block",HttpStatus.NO_CONTENT);
	}
}
