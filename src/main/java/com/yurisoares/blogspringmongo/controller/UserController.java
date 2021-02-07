package com.yurisoares.blogspringmongo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yurisoares.blogspringmongo.domain.User;
import com.yurisoares.blogspringmongo.dto.UserDTO;
import com.yurisoares.blogspringmongo.service.IUserService;

@RestController
@RequestMapping(value ="/users")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> listUsers = userService.findAll();
		List<UserDTO> listUsersDto = listUsers
				.stream()
				.map(UserDTO::new)
				.collect(Collectors.toList());
		
		return ResponseEntity.ok().body(listUsersDto);
	}
}
