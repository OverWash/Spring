package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.LaundryFactoryDTO;

public interface LaundryFactoryMapper {
	
	public List<LaundryFactoryDTO> getList();

	public void insertLaundryFactory(LaundryFactoryDTO factory);

	public LaundryFactoryDTO getLaundryFactory(Long factoryId);

	public int updateLaundryFactory(LaundryFactoryDTO factory);
	
	public int deleteLaundryFactory(Long factoryId); 
}
