package com.yurisoares.blogspringmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurisoares.blogspringmongo.domain.User;
import com.yurisoares.blogspringmongo.dto.UserDTO;
import com.yurisoares.blogspringmongo.exception.ObjectNotFoundException;
import com.yurisoares.blogspringmongo.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll(); 
	}

	@Override
	public User findById(final String id) {
		final Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado."));
	}

	@Override
	public User insert(final User user) {
		return this.userRepository.save(user);
	}
	
	@Override
	public User fromDTO(UserDTO userDto) {
		return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
	}

	@Override
	public void delete(String id) {
		//O que eh feito com o objeto que eh retornado no metodo abaixo?
		this.findById(id);
		this.userRepository.deleteById(id);
	}
	
}
