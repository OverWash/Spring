package com.meta.overwash.mapper;

import java.util.List;
import java.util.Map;

import com.meta.overwash.domain.CrewDTO;

public interface CrewMapper {
	
	public void insertCrew(CrewDTO crewDTO) throws Exception;
	
	public List<CrewDTO> getCrewList(String role) throws Exception;
	
	public CrewDTO getCrew(Long crewId) throws Exception;

	public int updateCrew(CrewDTO crew) throws Exception;
	
	public int deleteCrew(Long crewId) throws Exception; 
}
