package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Crew;

public interface CrewMapper {
	public List<Crew> getList();

	public Integer get();

	public void crewInsert(Crew crew);

	public int crewUpdate(Crew crew);
	
	public int crewDelete(Long crewId); 
}
