package com.meta.overwash.mapper;

import com.meta.overwash.domain.UserDTO;

public interface UserMapper {

	public void insertUser(UserDTO user);

	// for login security
	public UserDTO getUser(String email);

	public int deleteUser(Long userId);

	public int updateUser(UserDTO user);
	
	public UserDTO getUserById(Long userId);
}
