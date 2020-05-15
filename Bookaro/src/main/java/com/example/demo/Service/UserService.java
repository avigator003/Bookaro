package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public interface UserService {

	
	public void saveUser(User user);
}
