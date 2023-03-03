package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain. WashingComplete;

public interface WashingCompleteMapper {
	
	public List<WashingComplete> getList();

	public void insertWashingComplete(WashingComplete wc);
	
	public WashingComplete getWashingComplete(Long wcId); 

	public int updateWashingComplete(WashingComplete wc);
	
	public int deleteWashingComplete(Long wcId); 
}
