package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Crew;

public interface CrewMapper {
	
	public List<Crew> getList();

	public void insertCrew(Crew crew);
	
	public Crew getCrew(Long crewId);

	public int updateCrew(Crew crew);
	
	public int deleteCrew(Long crewId); 
}
