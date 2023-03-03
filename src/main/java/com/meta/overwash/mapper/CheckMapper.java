package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Check;

public interface CheckMapper {
	
	public List<Check> getList();
	
	public void insertCrew(Check check);
	
	public Check getCrew(Long checkId);

	public int updateCrew(Check check);
	
	public int deleteCrew(Long checkId); 
}
