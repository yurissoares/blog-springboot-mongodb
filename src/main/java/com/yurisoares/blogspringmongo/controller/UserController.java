package com.yurisoares.blogspringmongo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yurisoares.blogspringmongo.domain.User;

@RestController
@RequestMapping(value ="/users")
public class UserController {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> listUsers = new ArrayList<>();
		User u1 = new User("1", "Maria", "maria@email.com");
		User u2 = new User("2", "Joao", "joao@email.com");
		User u3 = new User("3", "Yuri", "yuri@email.com");
		listUsers.addAll(Arrays.asList(u1,u2,u3));
		
		return ResponseEntity.ok().body(listUsers);
	}
}
