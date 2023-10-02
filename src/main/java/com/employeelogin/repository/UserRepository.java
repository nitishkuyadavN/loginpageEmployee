package com.employeelogin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeelogin.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {
	    User findByUserId(String userId);
	    User findByEmail(String email);
	    List<User> findByMobileNo(String mobileNo);
	}

