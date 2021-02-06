package com.yurisoares.blogspringmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurisoares.blogspringmongo.domain.User;
import com.yurisoares.blogspringmongo.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll(); 
	}
	
	
}
