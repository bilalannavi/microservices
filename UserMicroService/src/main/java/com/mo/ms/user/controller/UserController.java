package com.mo.ms.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mo.ms.user.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@GetMapping
	public User getTestUser() {
		return new User(-1L, "TestUser", "testuset@test.com");
	}
}
