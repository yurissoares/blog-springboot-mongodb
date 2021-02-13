package com.yurisoares.blogspringmongo.service;

import java.util.List;

import com.yurisoares.blogspringmongo.domain.User;
import com.yurisoares.blogspringmongo.dto.UserDTO;

public interface IUserService {

	public List<User> findAll();
	
	public User findById(final String id);
	
	public User insert(final User user);
	
	public User fromDTO(final UserDTO userDto);
	
	public void delete(final String id);
}
