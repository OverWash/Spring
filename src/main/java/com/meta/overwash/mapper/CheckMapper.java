package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.CheckDTO;

public interface CheckMapper {
	
	public List<CheckDTO> getList();
	
	public void insertCrew(CheckDTO check);
	
	public CheckDTO getCrew(Long checkId);

	public int updateCrew(CheckDTO check);
	
	public int deleteCrew(Long checkId); 
}
