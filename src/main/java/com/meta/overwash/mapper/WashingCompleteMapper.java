package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain. WashingComplete;

public interface WashingCompleteMapper {
	public List<WashingComplete> getList();

	public Integer get();

	public void washingCompleteInsert(WashingComplete wc);

	public int washingCompleteUpdate(WashingComplete wc);
	
	public int washingCompleteDelete(Long wcId); 
}
