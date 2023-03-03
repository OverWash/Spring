package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.CrewDTO;

public interface CrewMapper {
	
	public List<CrewDTO> getList();

	public void insertCrew(CrewDTO crew);
	
	public CrewDTO getCrew(Long crewId);

	public int updateCrew(CrewDTO crew);
	
	public int deleteCrew(Long crewId); 
}
