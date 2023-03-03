package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain. WashingCompleteDTO;

public interface WashingCompleteMapper {
	
	public List<WashingCompleteDTO> getList();

	public void insertWashingComplete(WashingCompleteDTO wc);
	
	public WashingCompleteDTO getWashingComplete(Long wcId); 

	public int updateWashingComplete(WashingCompleteDTO wc);
	
	public int deleteWashingComplete(Long wcId); 
}
