package com.example.Departmento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Departmento.entities.User;
import com.example.Departmento.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> result = userrepository.findAll();
		
		return result;
	}
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id){
		User result = userrepository.findById(id).get();
		
		return result;
	}
	@PostMapping
	public User insert(@RequestBody User user){
		User result = userrepository.save(user);
		
		return result;
	}
	
	

}
