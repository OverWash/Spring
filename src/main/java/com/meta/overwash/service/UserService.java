package com.meta.overwash.service;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.MemberDTO;
import com.meta.overwash.domain.UserDTO;

public interface UserService {
	
	public void registerUser(UserDTO user, MemberDTO member);
	
	public void registerUser(UserDTO user, CrewDTO crew);
	
	// for login
	public UserDTO getUser(UserDTO user);

	public int deleteUser(Long user_id, MemberDTO member);
	
	public int deleteUser(Long user_id, CrewDTO crew);

	public int updateUser(UserDTO user);
	
}
