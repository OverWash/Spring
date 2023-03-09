package com.meta.overwash.mapper;

import com.meta.overwash.domain.UserDTO;

public interface UserMapper {

	public void insertUser(UserDTO user);

	// for login
	public UserDTO getUser(String email);

	public int deleteUser(Long user_id);

	public int updateUser(UserDTO user);

}
