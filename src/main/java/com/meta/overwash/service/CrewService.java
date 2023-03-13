package com.meta.overwash.service;

import java.util.List;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.UserDTO;

public interface CrewService {
	
	public void insert(UserDTO userDTO, CrewDTO crewDTO) throws Exception;
	
	public boolean remove(Long crewId) throws Exception;
	
	public boolean modify(UserDTO user, CrewDTO crewDTO) throws Exception;
	
	public CrewDTO getCrew(Long userId) throws Exception;
	
	public List<CrewDTO> getCrewList(String role) throws Exception;

	public boolean checkPw(UserDTO user) throws Exception;
	
	public String getContact(String contact) throws Exception;
}
