package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.UserDTO;

public interface UserMapper {
	
	public void insertUser(UserDTO user) throws Exception;
	
	public List<UserDTO> getList() throws Exception;

	public UserDTO getUser(Long userId) throws Exception;

	public int updateUser(UserDTO user) throws Exception;
	
	public int deleteUser(Long userId) throws Exception; 
}
