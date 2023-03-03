package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.Check;

public interface CheckMapper {
	public List<Check> getList();

	public Integer get();

	public void checkInsert(Check check);

	public int checkUpdate(Check check);
	
	public int checkDelete(Long checkId); 
}
