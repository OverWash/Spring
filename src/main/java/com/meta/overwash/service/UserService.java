package com.meta.overwash.service;

import com.meta.overwash.domain.UserDTO;

public interface UserService {
	
	public UserDTO getUser(String email);
	
	public UserDTO getUserById(Long userId);

}
