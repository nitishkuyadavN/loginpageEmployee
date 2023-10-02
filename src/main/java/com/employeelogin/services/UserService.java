package com.employeelogin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeelogin.entities.User;
import com.employeelogin.repository.UserRepository;

@Service
public class UserService {
	
	    @Autowired
	    private UserRepository userRepository;
	    
	    public User registerUser(User user) {
	    	return userRepository.save(user);
	    }
	    
	    public User loginUser(User user) {
	    	return userRepository.findByUserId(user.getUserId());
	    }
	}
