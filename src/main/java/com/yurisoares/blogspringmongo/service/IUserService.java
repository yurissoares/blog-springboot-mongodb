package com.yurisoares.blogspringmongo.service;

import java.util.List;

import com.yurisoares.blogspringmongo.domain.User;

public interface IUserService {

	public List<User> findAll();
}
