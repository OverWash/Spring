package com.meta.overwash.service;

import com.meta.overwash.domain.CrewDTO;

public interface CrewService {
	
	public void insertCrew(CrewDTO crewDTO) throws Exception;
	
	public boolean remove(Long crewId) throws Exception;
	
	public boolean modify(CrewDTO crewDTO) throws Exception;
	
	public CrewDTO get(Long crewId) throws Exception;
}
