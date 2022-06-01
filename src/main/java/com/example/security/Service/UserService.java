package com.example.security.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.security.Model.User;

@Service
public class UserService {

	List<User> list=new ArrayList<>();

	public UserService() {
	list.add(new User( "abc", "abc", "abc@mail.com"));
	list.add(new User( "xyz", "xyz", "xyz@mail.com"));
	
	}
	
	//to return all users
	public List<User> getAllUser(){
		return this.list;
	}
     
	//to return user with specified name
	public User getUser(String username) {
		try {
		return this.list.stream().filter((user)->user.getUserName().equals(username)).findAny().orElseThrow();
		}catch(Exception e) {
			 System.out.println("user not found");
			 return null;
		}
	}
	
	// to add new user to list
	public User adduser(User user) {
	 this.list.add(user);
	 return user;
	}
	
}
