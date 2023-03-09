package com.meta.overwash.mapper;

import java.util.List;
import java.util.Map;

import com.meta.overwash.domain.CrewDTO;

public interface CrewMapper {
	
	public List<CrewDTO> getList() throws Exception;

	public void insertCrew(CrewDTO crewDTO) throws Exception;
	
	public Map<String, Object> getCrew(Long crewId) throws Exception;

	public int updateCrew(CrewDTO crew) throws Exception;
	
	public int deleteCrew(Long crewId) throws Exception; 
}
