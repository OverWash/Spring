package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.CrewDTO;
import com.meta.overwash.domain.UserDTO;

public interface CrewMapper {

	public void insertCrew(CrewDTO crewDTO) throws Exception;

	public List<CrewDTO> getCrewList(String role) throws Exception;

	public CrewDTO getCrew(Long userId) throws Exception;

	public int updateCrew(CrewDTO crew) throws Exception;

	public int deleteCrew(Long crewId) throws Exception;
	
	public String getCrewContact(String contact) throws Exception;
}
