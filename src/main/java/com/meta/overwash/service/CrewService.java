package com.meta.overwash.service;

import java.util.Map;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.UserDTO;

public interface CrewService {
	
	public void insert(UserDTO userDTO, CrewDTO crewDTO) throws Exception;
	
	public boolean remove(Long crewId) throws Exception;
	
	public boolean modify(CrewDTO crewDTO) throws Exception;
	
	public Map<String, Object> get(Long crewId) throws Exception;
}
