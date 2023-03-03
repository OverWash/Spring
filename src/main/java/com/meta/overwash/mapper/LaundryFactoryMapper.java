package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.LaundryFactory;

public interface LaundryFactoryMapper {
	
	public List<LaundryFactory> getList();

	public void insertLaundryFactory(LaundryFactory factory);

	public LaundryFactory getLaundryFactory(Long factoryId);

	public int updateLaundryFactory(LaundryFactory factory);
	
	public int deleteLaundryFactory(Long factoryId); 
}
