package com.meta.overwash.mapper;

import java.util.List;

import com.meta.overwash.domain.LaundryFactory;

public interface LaundryFactoryMapper {
	public List<LaundryFactory> getList();

	public Integer get();

	public void laundryFactoryInsert(LaundryFactory laundryFactory);

	public int laundryFactoryUpdate(LaundryFactory laundryFactory);
	
	public int laundryFactoryDelete(Long factoryId); 
}
