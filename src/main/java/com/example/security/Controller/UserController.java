package com.example.security.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.Model.User;
import com.example.security.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUser(){
		return this.userService.getAllUser();
	}
	
	@GetMapping("/{name}")
	public User getUser(@PathVariable("name") String name) {
		return this.userService.getUser(name);
	}
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return this.userService.adduser(user);
	}
	
}
