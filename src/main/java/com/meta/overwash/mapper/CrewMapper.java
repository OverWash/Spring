package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.CrewDTO;

public interface CrewMapper {
	
	public List<CrewDTO> getList() throws Exception;

	public void insertCrew(CrewDTO crew) throws Exception;
	
	public CrewDTO getCrew(Long crewId) throws Exception;

	public int updateCrew(CrewDTO crew) throws Exception;
	
	public int deleteCrew(Long crewId) throws Exception; 
}
