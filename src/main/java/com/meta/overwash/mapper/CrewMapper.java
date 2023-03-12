package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.CrewDTO;

public interface CrewMapper {

	public void insertCrew(CrewDTO crewDTO) throws Exception;

	public List<CrewDTO> getCrewList(String role) throws Exception;

	public CrewDTO getCrew(Long userId);

	public int updateCrew(CrewDTO crew);

	public int deleteCrew(Long crewId);
	
	public String getCrewContact(String contact) throws Exception;
}
