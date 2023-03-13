package com.meta.overwash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.overwash.domain.UserDTO;
import com.meta.overwash.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public UserDTO getUser(String email) {
		return userMapper.getUser(email);
	}

	@Override
	public UserDTO getUserById(Long userId) {
		return userMapper.getUserById(userId);
	}



}
